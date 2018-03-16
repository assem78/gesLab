package com.ausy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ausy.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, String>{

}
