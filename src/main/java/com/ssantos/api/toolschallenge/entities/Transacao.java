package com.ssantos.api.toolschallenge.entities;

import com.ssantos.api.toolschallenge.enums.TipoEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cartao;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, optional = false, targetEntity = FormaPagamento.class)
	private FormaPagamento formaPagamento;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, optional = false, targetEntity = Descricao.class)
	private Descricao descricao;

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
		return formaPagamento;
	}

	public void setFormapagamento(FormaPagamento formapagamento) {
		this.formaPagamento = formapagamento;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

}
