package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cg.entity.Test;
import com.cg.entity.User;
import com.cg.service.OnlineTestServiceI;


@SpringBootApplication
public class OnlineTestManagementApplication {

	@Autowired
	OnlineTestServiceI service;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementApplication.class, args);
	}



}
