package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Persona;

public interface IpersonaRepo  extends JpaRepository<Persona, Integer>{

}
