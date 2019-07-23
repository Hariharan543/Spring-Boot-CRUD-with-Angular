package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.entity.User;

import com.example.demo.repository.UserRepository;



@SpringBootApplication

public class Crudbackend1Application implements CommandLineRunner{
	
@Autowired
	
private UserRepository userrepository;
	
	
	
public static void main(String[] args) {
		
SpringApplication.run(Crudbackend1Application.class, args);
	
}



	@Override
	
public void run(String... args) throws Exception {
		
// TODO Auto-generated method stub
		
userrepository.save(new User("one","one"));		
		
userrepository.save(new User("two","two"));		
		
userrepository.save(new User("three","three"));		
	
}

}

