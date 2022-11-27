package com.ssantos.api.toolschallenge.entities;

import com.ssantos.api.toolschallenge.enums.StatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Descricao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDescricao;
	private double valor;
	private String dataHora;
	private String estabelecimento;
	private String nsu;
	private String codigoAutorizacao;
	private StatusEnum status;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getNsu() {
		return nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public String getCodigoAutorizacao() {
		return codigoAutorizacao;
	}

	public void setCodigoAutorizacao(String codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Long getId() {
		return idDescricao;
	}

	public void setId(Long idDescricao) {
		this.idDescricao = idDescricao;
	}

}
