package com.jeffcrew.sunshine.service;

import java.io.Serializable;

import com.jeffcrew.sunshine.domain.Category;

public interface SunshineService {

	public Category getCategory(Serializable id);

}
