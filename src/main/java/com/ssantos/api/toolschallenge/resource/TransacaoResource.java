package com.ssantos.api.toolschallenge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssantos.api.toolschallenge.entities.Transacao;
import com.ssantos.api.toolschallenge.service.TransacaoService;

@RestController
@RequestMapping(value = "/pagamentos")
public class TransacaoResource {

	@Autowired
	private TransacaoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Transacao> findById(@PathVariable Long id) {
		Transacao obj = this.service.consultarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
