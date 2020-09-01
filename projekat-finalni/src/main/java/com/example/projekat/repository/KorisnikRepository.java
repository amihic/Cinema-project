package com.example.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projekat.entity.*;
import com.example.projekat.entity.Korisnik;



import java.util.List;


import com.example.projekat.*;
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

	
}

