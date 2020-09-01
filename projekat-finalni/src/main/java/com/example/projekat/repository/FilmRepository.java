package com.example.projekat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projekat.entity.*;

public interface FilmRepository extends JpaRepository<Film,Long> {
	
	List<Film> findAllByOrderByOcenaDesc();

}
