package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.Usuario;

public interface IUsuarioRepo   extends JpaRepository<Usuario, Integer> {

	Usuario findByNombre(String nombre);
}
