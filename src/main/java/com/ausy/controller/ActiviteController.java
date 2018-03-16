package com.ausy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ausy.entities.Activite;
import com.ausy.repository.ActiviteRepository;

@Controller
@RequestMapping(value="/activites")
public class ActiviteController {
	@Autowired
	ActiviteRepository activiteRepo;
	@RequestMapping(value="/index")
	public String index(Model model){
		List<Activite> activites = activiteRepo.findAll();
		model.addAttribute("activites", activites);
		return "activites";
	}

}
