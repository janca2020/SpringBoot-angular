package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.Model.Usuario;
import com.example.demo.Repo.IUsuarioRepo;

@SpringBootTest
class SpringDataJpa1ApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	void crearUsuario() {
		
		Usuario u= new Usuario();
		
		u.setId(2);
		u.setNombre("mito");
		u.setClave(encoder.encode("123"));
		Usuario retorno = repo.save(u);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(u.getClave()));
	}

}
