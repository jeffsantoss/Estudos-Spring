package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
public class HomeController {

	@Autowired
	Shipwreck reck;
	
	@RequestMapping("/")
	public String home() {
		
		reck.setCondition("condição");
		reck.setDepth(1234);
		reck.setDescription("Descrição");
		reck.setName("nome_hehehe");
		
		return reck.toString();
	}
}
