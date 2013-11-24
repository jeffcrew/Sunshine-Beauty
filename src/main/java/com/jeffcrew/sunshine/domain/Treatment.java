package com.jeffcrew.sunshine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="Treatment")
public class Treatment extends SimpleObject
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="Description")
    protected String    description;
    
	@ManyToOne
	@JoinColumn(name="CategoryID")
	@JsonBackReference
    protected Category	category; //body, face, etc...
    
	@Transient
    protected int       duration;
    
    public String getDescription() { return description; }
    //public Category getCategory() { return category; }
    public int getDuration() { return duration; }
    
    public void setDescription(String rhs) { description=rhs; }
    public void setDuration(int rhs) { duration=rhs; }
       
}