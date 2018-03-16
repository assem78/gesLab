package com.ausy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ausy.entities.Log;

public interface LogRepository extends JpaRepository<Log, Long>{

}
