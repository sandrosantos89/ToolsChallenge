package com.ssantos.api.toolschallenge;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ssantos.api.toolschallenge.entities.Transacao;
import com.ssantos.api.toolschallenge.repositories.TransacaoRepository;

@SpringBootApplication
public class ToolsChallengeApplication implements CommandLineRunner{

	@Autowired
	private TransacaoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ToolsChallengeApplication.class, args);
	}

	@Override
	public void run(String... args ) throws Exception{
		Transacao tr1 = new Transacao();
		repository.saveAll(Arrays.asList(tr1));
	}
}
