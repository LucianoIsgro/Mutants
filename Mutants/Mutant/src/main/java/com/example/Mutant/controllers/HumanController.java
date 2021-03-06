package com.example.Mutant.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mutant.entities.Human;
import com.example.Mutant.services.HumanServiceImplementation;



@RestController
@CrossOrigin(origins = "*") 
@RequestMapping(path = "api/v1/humans")
public class HumanController extends BaseControllerImplementation<Human,HumanServiceImplementation> {
	
	
}
