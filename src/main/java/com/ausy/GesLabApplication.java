package com.ausy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ausy.entities.Activite;
import com.ausy.entities.Log;
import com.ausy.entities.Personne;
import com.ausy.entities.Privilege;
import com.ausy.entities.User;
import com.ausy.repository.ActiviteRepository;
import com.ausy.repository.PersonneRepository;
import com.ausy.repository.UserRepository;

@SpringBootApplication
public class GesLabApplication implements CommandLineRunner{
	@Autowired
	ActiviteRepository activiteRepo;
	@Autowired
	UserRepository userRepo;
	@Autowired
	PersonneRepository personneRepo;
	public static void main(String[] args) {
		SpringApplication.run(GesLabApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
//		List<Log> listeLogs = new ArrayList<>();
//		Activite activite = new Activite(1L,"Receptioniste", "reception", listeLogs);
//		activiteRepo.save(activite);
//		personneRepo.save(new Personne("MOHAMED CHERIF", "Assem", "M", new Date(), "", "", "", "", 123456789));
//		List<Privilege> listePrivileges = new ArrayList<>();
//		userRepo.save(new User(1L,false, listePrivileges, listeLogs));
	}
}
