package com.example.projekat.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projekat.entity.*;
import com.example.projekat.repository.*;
import org.springframework.stereotype.Service;


@Service
public class AdministratorService {
	
	@Autowired
	private AdministratorRepository administratorRepository;
	
	public Administrator find(String userName,String password) {
		Administrator a=this.administratorRepository.findByUserNameAndPassword(userName, password);
		return a;
	}
}