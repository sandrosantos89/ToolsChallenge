package com.ssantos.api.toolschallenge.entrities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cartao;
	private FormaPagamento formapagamento;
	private Descricao descricao;

	public Transacao() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public FormaPagamento getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(FormaPagamento formapagamento) {
		this.formapagamento = formapagamento;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}
	
	

}
