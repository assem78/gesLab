package com.ausy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ausy.entities.Patient;
import com.ausy.repository.PatientRepository;

@Controller
public class GesLabController {
	@Autowired
	PatientRepository patientRepo;
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		Patient patient = new Patient();
		modelAndView.addObject("patient", patient);
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ModelAndView registration(@Valid Patient p, BindingResult bindingResult){
		ModelAndView modelAndView = new ModelAndView();
		// (à faire) verifier si patient existe en base
		patientRepo.save(p);
		modelAndView.addObject("successMessage", "Le patient a été ajouté avec succes");
		modelAndView.addObject("patient", new Patient());
		modelAndView.setViewName("Enregistrement d'un patient");
		return modelAndView;
		
	}
}
