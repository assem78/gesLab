package com.ausy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ausy.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
