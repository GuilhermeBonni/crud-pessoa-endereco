package com.bonni.guilherme.testeTecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonni.guilherme.testeTecnico.entidades.Endereco;
import com.bonni.guilherme.testeTecnico.repositorio.EnderecoRepositorio;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepositorio repositorio;
	
	@GetMapping
	public List<Endereco> findAll() {
		return repositorio.findAll();
	}
	
	@PostMapping
	public Endereco insert(@RequestBody Endereco endereco) {
		return repositorio.save(endereco);
	}

}
