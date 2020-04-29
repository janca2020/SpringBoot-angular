package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Persona;
import com.example.demo.Repo.IpersonaRepo;


@Controller
public class Controlador {
	@Autowired
	private IpersonaRepo repo;
	
	@GetMapping("/persona")
	public String greeting (@RequestParam(name ="name" ,required=false, defaultValue="world") String name ,Model  model) {
		Persona p = new Persona();
		
		p.setId(3);
		p.setNombre("code");
		
		repo.save(p);
		
		model.addAttribute("name" , name);
		return "greeting";	
	}
	
	@GetMapping("/listar")
	public String greeting (Model  model) {
		model.addAttribute("personas" , repo.findAll());
		return "listar";	
	}
	
	

}

