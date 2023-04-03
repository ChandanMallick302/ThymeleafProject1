package com.thymeleaf1.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {
	
	//http:localhost:8080/about
	@RequestMapping(value = "/about",method =RequestMethod.GET)
	public String about(Model model) {
		
		//puting data in model
		model.addAttribute("name", "chandan");
		model.addAttribute("currentdate", new Date().toLocaleString());
		
		//String nameString="abc";
		//nameString.toUpperCase();
		
		
		return "about";
		//about.html
	}
	
}
