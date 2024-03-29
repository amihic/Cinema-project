package com.example.projekat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projekat.repository.BioskopRepository;
import com.example.*;

import com.example.projekat.repository.*;
import org.springframework.stereotype.Service;


import com.example.projekat.entity.*;
import com.example.projekat.repository.KorisnikRepository;
@Service
public class BioskopService {

	

	@Autowired 
	private BioskopRepository bioskopRepository;
	
	public Bioskop saveBioskop(Bioskop bioskop)
	{
		return this.bioskopRepository.save(bioskop);
	}
	
	public List<Bioskop> findAll() {
		// TODO Auto-generated method stub
		List<Bioskop> bioskopi = this.bioskopRepository.findAll();
        return bioskopi;
	}
	public void delete(Long id) {
		this.bioskopRepository.deleteById(id);
	}
	
	public Bioskop findOne(Long id) {
		Bioskop bioskop=this.bioskopRepository.getOne(id);
		return bioskop;
	}
	
}
