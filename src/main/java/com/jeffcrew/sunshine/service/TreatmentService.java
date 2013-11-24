package com.jeffcrew.sunshine.service;

import java.io.Serializable;
import java.util.List;

import com.jeffcrew.sunshine.domain.Treatment;

public interface TreatmentService {

	public void addTreatment(Treatment treatment);

	public void updateTreatment(Treatment treatment);

	public Treatment getTreatment(Serializable id);

	public void deleteTreatment(Serializable id);

	public List<Treatment> getTreatments();

}
