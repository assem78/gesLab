package com.ausy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ausy.entities.Patient;
import com.ausy.repository.PatientRepository;

@Controller
@RequestMapping(value="/patients")
public class PatientController {
	@Autowired
	PatientRepository patientRepo;
	@RequestMapping(value="/index")
	public String index(Model model, 
						@RequestParam(name="page", defaultValue="0") int page){
		Page<Patient> pagePatients = patientRepo.findAll(new PageRequest(page, 2));
		int pagesCount = pagePatients.getTotalPages();
		int[] pages = new int[pagesCount];
		for(int i=0; i<pagesCount; i++) pages[i]=i;
		model.addAttribute("pages", pages);
		model.addAttribute("pagePatients", pagePatients);
		return "patients";
	}
}
