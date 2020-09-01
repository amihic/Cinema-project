package com.example.projekat.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projekat.repository.*;
import org.springframework.stereotype.Service;

import com.example.*;
import com.example.projekat.entity.*;
import com.example.projekat.repository.KorisnikRepository;


@Service
public class KorisnikService {
	
	@Autowired
    private KorisnikRepository korisnikRepository;
	
	
	public Korisnik saveKorisnik(Korisnik korisnik) {
    	return this.korisnikRepository.save(korisnik);
    }

	public List<Korisnik> findAll() {
		List<Korisnik> korisnici = this.korisnikRepository.findAll();
        return korisnici;
	}
	
	
	
	
	

}
