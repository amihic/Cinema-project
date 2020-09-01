package com.example.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projekat.entity.*;

public interface MenadzerRepository extends JpaRepository<Menadzer,Long> {
	
	Menadzer findByUserNameAndPassword(String userName,String password);

}
