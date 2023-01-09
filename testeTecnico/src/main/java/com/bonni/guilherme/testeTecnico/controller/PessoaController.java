package com.bonni.guilherme.testeTecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonni.guilherme.testeTecnico.entidades.Pessoa;
import com.bonni.guilherme.testeTecnico.repositorio.PessoaRepositorio;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepositorio repositorio;
	
	@GetMapping
	public List<Pessoa> findAll() {
		return repositorio.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Pessoa findById(@PathVariable Long id) {
		return repositorio.findById(id).get();
	}

	@PostMapping
	public Pessoa insert(@RequestBody Pessoa pessoa) {
		return repositorio.save(pessoa);
	}
	
	@PutMapping(value = "/{id}")
	public Pessoa update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		Pessoa pessoaAtualizada = repositorio.getReferenceById(id);
		updateDados(pessoaAtualizada, pessoa);
		return repositorio.save(pessoaAtualizada);
	}
	
	private void updateDados(Pessoa pessoa, Pessoa obj) {
		pessoa.setNome(obj.getNome());
		pessoa.setDataNascimento(obj.getDataNascimento());
		pessoa.setEndereco(obj.getEndereco());
		pessoa.setEnderecoPrincipal(obj.isEnderecoPrincipal());
	}
}
