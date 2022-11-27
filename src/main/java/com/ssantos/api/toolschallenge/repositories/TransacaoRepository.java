package com.ssantos.api.toolschallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssantos.api.toolschallenge.entrities.Transacao;

public interface TransacaoRepository extends  JpaRepository<Transacao, Integer>{

}
