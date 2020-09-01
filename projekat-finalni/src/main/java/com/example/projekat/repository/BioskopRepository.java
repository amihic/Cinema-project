package com.example.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projekat.entity.*;
import com.example.projekat.entity.Bioskop;
import com.example.projekat.*;

public interface BioskopRepository extends JpaRepository<Bioskop, Long> {
	

}