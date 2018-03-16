package com.ausy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ausy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
