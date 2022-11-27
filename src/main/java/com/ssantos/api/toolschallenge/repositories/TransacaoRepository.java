package com.ssantos.api.toolschallenge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssantos.api.toolschallenge.entities.Transacao;

public interface TransacaoRepository extends  JpaRepository<Transacao, Integer>{

	void findAllById(List<Transacao> asList);

}
