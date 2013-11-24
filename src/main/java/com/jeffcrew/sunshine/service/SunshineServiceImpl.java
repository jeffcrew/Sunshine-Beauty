package com.jeffcrew.sunshine.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffcrew.sunshine.domain.Category;
import com.jeffcrew.sunshine.repository.HibernateDAO;

@Service
public class SunshineServiceImpl implements SunshineService {

	@Autowired
	private HibernateDAO hibernateDAO;

	@Override
	public Category getCategory(Serializable id) {
		return hibernateDAO.getCategory(id);	
	}
	
}
