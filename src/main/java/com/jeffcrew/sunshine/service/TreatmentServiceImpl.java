package com.jeffcrew.sunshine.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffcrew.sunshine.domain.Treatment;
import com.jeffcrew.sunshine.repository.HibernateDAO;

@Service
public class TreatmentServiceImpl implements TreatmentService {

	@Autowired
	private HibernateDAO hibernateDAO;

	public void addTreatment(Treatment treatment) {
		hibernateDAO.save(treatment);
	}

	public void updateTreatment(Treatment treatment) {
		hibernateDAO.saveOrUpdate(treatment);
	}

	public Treatment getTreatment(Serializable id) {
		return hibernateDAO.getById(Treatment.class, id);
	}

	public void deleteTreatment(Serializable id) {
		Treatment t = hibernateDAO.getById(Treatment.class, id);
		hibernateDAO.delete(t);
	}

	public List<Treatment> getTreatments() {
		return hibernateDAO.getAll(Treatment.class);
	}
}
