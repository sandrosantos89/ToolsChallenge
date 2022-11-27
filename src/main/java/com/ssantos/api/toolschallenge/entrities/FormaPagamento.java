package com.ssantos.api.toolschallenge.entrities;

import com.ssantos.api.toolschallenge.enums.TipoEnum;

public class FormaPagamento {

	private Integer parcelas;
	private TipoEnum tipo;
	
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
	
	
}
