package com.jeffcrew.sunshine.repository;

import com.jeffcrew.sunshine.domain.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;



@Repository
public class HibernateDAOImpl implements HibernateDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public <T> void saveOrUpdate(T t) {
		getCurrentSession().saveOrUpdate(t);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> getAll(Class<T> t) {
		
		List<T> items = getCurrentSession().createCriteria(t).list();
		return items;
	}

	@Override
	public <T> void save(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T getById(Class<T> t, Serializable id) {
		// TODO Auto-generated method stub
		Object obj = getCurrentSession().get(t, id);
		
		return (T)obj;
	}

	/**
	 * returns the first instance of a matching category or NULL if none exists
	 */
	public Category getCategory(Serializable id)	{
		
		Criteria criteria = getCurrentSession().createCriteria(Category.class);
		criteria.createCriteria("treatments", "treatments", JoinType.LEFT_OUTER_JOIN);
		criteria.createCriteria("children", "children", JoinType.LEFT_OUTER_JOIN);
		criteria.add(Restrictions.idEq(id));
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		
		List<Category> categorys = criteria.list();
		if (categorys.size() > 0) {
			return categorys.get(0);
		}
		
		return null;
		
	}
}