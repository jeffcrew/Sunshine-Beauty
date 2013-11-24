package com.jeffcrew.sunshine.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

public class HibernateAwareObjectMapper extends ObjectMapper {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6644155817044746338L;

	public HibernateAwareObjectMapper() {
        registerModule(new Hibernate4Module());
    }
}