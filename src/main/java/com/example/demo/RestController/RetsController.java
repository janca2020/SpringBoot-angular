package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Persona;
import com.example.demo.Repo.IpersonaRepo;

@RestController
@RequestMapping("/per")
public class RetsController {

	@Autowired
	private IpersonaRepo repo;

	@GetMapping
	public List<Persona> listar() {
return repo.findAll();
	}
	

	@PostMapping
	public void insertar(@RequestBody Persona per) {
         
		repo.save(per);
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona per) {
         
		repo.save(per);
	}
	
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
         
		repo.deleteById(id);
	}
	
}
