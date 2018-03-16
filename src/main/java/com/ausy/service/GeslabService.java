package com.ausy.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ausy.entities.Activite;
import com.ausy.entities.Patient;
import com.ausy.entities.User;
import com.ausy.repository.ActiviteRepository;
import com.ausy.repository.PatientRepository;
import com.ausy.repository.PersonneRepository;
import com.ausy.repository.UserRepository;

@RestController
@RequestMapping("/rest")
public class GeslabService {
	public static final Logger logger = LoggerFactory.getLogger(GeslabService.class);
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ActiviteRepository activiteRepo;
	@Autowired
	private PersonneRepository personneRepo;
	@Autowired
	private PatientRepository patientRepo;
	// -----------Rechercher tous les users-----------------------
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	// -----------Rechercher un user------------------------------
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable("id")Long id){
		return userRepo.findOne(id);
	}
	// -----------Rechercher tous les activites------------------------------
	@RequestMapping(value="/activites", method=RequestMethod.GET)
	public List<Activite> getAllActivites(){
		return activiteRepo.findAll();
	}
	// -----------Rechercher une activite------------------------------
		@RequestMapping(value="/activites/{id}", method=RequestMethod.GET)
		public Activite getActivite(@PathVariable("id")Long id){
			return activiteRepo.findOne(id);
		}
	// -----------Rechercher tous les patients-----------------------
		@RequestMapping(value="/sicks", method=RequestMethod.GET)
		public List<Patient> getAllSick(){
			return patientRepo.findAll();
		}
		// -----------Rechercher un patient------------------------------
		@RequestMapping(value="/sicks/{id}", method=RequestMethod.GET)
		public Patient getSick(@PathVariable("id")Long id){
			return patientRepo.findOne(id);
		}
		// -----------Creer un patient------------------------------
		@RequestMapping(value="/sicks/", method=RequestMethod.POST)
		public Patient createSick(@RequestBody Patient p){
			// à faire vérifier si le patient existe déja en base
			
			logger.info("Création du patient en base : {}", p);
			 return patientRepo.save(p);
		}
				
}
