package com.ssantos.api.toolschallenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssantos.api.toolschallenge.entities.Transacao;

@Service
public interface TransacaoService {

	public Transacao pagamento(Transacao transacao);

	public List<Transacao> consultarTodasTransacoes();

	public Transacao consultarPorId(Long id);

	public Transacao respostaPagamento(Transacao transacao);

	public Transacao estornarPagamento(Transacao transacao);

}
