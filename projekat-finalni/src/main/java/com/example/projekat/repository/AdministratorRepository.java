package com.example.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.projekat.entity.*;
public interface AdministratorRepository extends JpaRepository<Administrator,Long>{
	
	Administrator findByUserNameAndPassword(String userName,String password);

}
