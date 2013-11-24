package com.jeffcrew.sunshine.repository;

import java.io.Serializable;
import java.util.List;

import com.jeffcrew.sunshine.domain.Category;

public interface HibernateDAO {

		public <T> void saveOrUpdate(T t);
		public <T> void save(T t);
		public <T> T getById(Class<T> t, Serializable id);
		public <T> void delete(T t);
		public <T> List<T> getAll(Class<T> t);

		
		public Category getCategory(Serializable id);
}
