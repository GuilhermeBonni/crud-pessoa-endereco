package com.bonni.guilherme.testeTecnico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bonni.guilherme.testeTecnico.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long>{

}
