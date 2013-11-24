package com.jeffcrew.sunshine.web;

import java.util.HashSet;
import java.util.Set;

import javassist.NotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeffcrew.sunshine.domain.Category;
import com.jeffcrew.sunshine.service.SunshineService;

/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("category")
public class CategoryController {

	@Autowired
	private SunshineService sunshineService;

	private static final Logger logger = LoggerFactory
			.getLogger(CategoryController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ExtJSResponseAdapter<Category> getExtJSCategory(
			@PathVariable("id") Integer id) throws NotFoundException {
		Category c = sunshineService.getCategory(id);

		if (c == null) {
			throw new NotFoundException("No category found for ID: " + id);
		}
		
		return new ExtJSResponseAdapter<Category>(c);
	}

	/*
	 * get top level categories
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public ExtJSResponseAdapter<Set<Category>> getExtJSCategorys() {

		Set<Category> children = new HashSet<Category>();

		Category rootCategory = sunshineService.getCategory(Category.ROOT_ID);
		if (rootCategory != null)
			children = rootCategory.getChildren();

		return new ExtJSResponseAdapter<Set<Category>>(children, children.size());

	}

	
}
