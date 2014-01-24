package com.jeffcrew.sunshine.domain;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="Category")
public class Category extends SimpleObject
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int ROOT_ID = 91;
	
	@OneToMany(mappedBy="parent",cascade= CascadeType.ALL)
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
