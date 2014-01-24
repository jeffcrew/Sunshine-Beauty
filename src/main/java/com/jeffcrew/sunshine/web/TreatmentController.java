package com.jeffcrew.sunshine.web;

import com.jeffcrew.sunshine.domain.Treatment;
import com.jeffcrew.sunshine.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("treatment")
public class TreatmentController {

	@Autowired
    private TreatmentService treatmentService;

	@RequestMapping(value="/", method = RequestMethod.GET)
    @ResponseBody
	public ExtJSResponseAdapter<List<Treatment>> getTreatments() {
		
		try	{
			List<Treatment> treatments = treatmentService.getTreatments();
			return new ExtJSResponseAdapter<List<Treatment>>(treatments);
			
		}catch (Exception ex)	{
			ex.printStackTrace();
		}
		
		return null;
	}

	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
	public ExtJSResponseAdapter<Treatment> getTreatment(@PathVariable("id") Integer id, Model model) {
		return new ExtJSResponseAdapter<Treatment>(treatmentService.getTreatment(id));
	}
}
