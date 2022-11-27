package com.ssantos.api.toolschallenge.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ssantos.api.toolschallenge.enums.TipoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FormaPagamento")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FormaPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormaPagmento;
	private Integer parcelas;
	private TipoEnum tipo;

	public FormaPagamento() {

	}

	public FormaPagamento(Long idFormaPagmento, Integer parcelas, TipoEnum tipo) {
		super();
		this.idFormaPagmento = idFormaPagmento;
		this.parcelas = parcelas;
		this.tipo = tipo;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	public Long getIdFormaPagmento() {
		return idFormaPagmento;
	}

	public void setIdFormaPagmento(Long idFormaPagmento) {
		this.idFormaPagmento = idFormaPagmento;
	}
}
