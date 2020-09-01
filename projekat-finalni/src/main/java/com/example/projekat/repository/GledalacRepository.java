package com.example.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projekat.entity.*;

public interface GledalacRepository extends JpaRepository<Gledalac,Long>{

	Gledalac findByUserNameAndPassword(String userName,String password);
}

