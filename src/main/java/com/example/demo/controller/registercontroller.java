package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.register;
import com.example.demo.models.user;
import com.example.demo.service.registerservice;

@Controller
@RequestMapping("/register")
public class registercontroller {
	@Autowired
	private registerservice service;
	
	@GetMapping
	public String allusers(Model m) {
		m.addAttribute("users", service.getallusers());
		return "registeredstudents";
	}
	
	@GetMapping("/adduser")
	public String formreset(Model m) {
		m.addAttribute("register",new register());
		return "register";	
	}
	
	@PostMapping("/saveuser")
	public String saveuser(@ModelAttribute("register") register r) {
		service.save(r);
		return "redirect:/register";
	}
	

}
