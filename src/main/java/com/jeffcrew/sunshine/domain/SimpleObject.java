package com.jeffcrew.sunshine.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class SimpleObject implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	protected int		id;
	
	@Column(name="name")
	protected String	name;
	
	public SimpleObject(){}
	public SimpleObject(int id, String name) 
	{
		this.id=id; 
		this.name=name;
	}

	public void setId(int id) { this.id=id; }
	public void setName(String name) { this.name=name; }
	
	public int getId() { return id; }
	public String getName() { return name; }
	
	
}
