package com.jeffcrew.sunshine.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Category")
public class Category extends SimpleObject
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int ROOT_ID = 91;
	
	@OneToMany(mappedBy="parent",cascade=CascadeType.ALL)
    Set<Category> children;
	
	@OneToMany(mappedBy="category")
	@JsonManagedReference
	Set<Treatment> treatments;
	
	@ManyToOne
	@JoinColumn(name="ParentCategoryID")
	@JsonBackReference
	private Category parent;
	
	public Category(){}

	@JsonProperty
	public Set<Category> getChildren() {
		if (children == null) children = new HashSet<Category>();
		return children;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public Set<Treatment> getTreatments() {
		if (treatments == null) treatments = new HashSet<Treatment>();
		return treatments;
	}

	public void setTreatments(Set<Treatment> treatments) {
		this.treatments = treatments;
	}
	
	
}
