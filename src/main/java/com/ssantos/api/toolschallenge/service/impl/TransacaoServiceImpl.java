package com.ssantos.api.toolschallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssantos.api.toolschallenge.entities.Transacao;
import com.ssantos.api.toolschallenge.enums.StatusEnum;
import com.ssantos.api.toolschallenge.service.TransacaoService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TransacaoServiceImpl implements TransacaoService {

	private List<Transacao> transacoes = new ArrayList<>();

	@Override
	public List<Transacao> consultarTodasTransacoes() {
		return transacoes;
	}

	@Override
	public Transacao consultarPorId(Long id) {
		if (!transacoes.isEmpty()) {
			for (Transacao list : transacoes) {
				if (list.getId().equals(id)) {
					return list;
				}
			}
			throw new RuntimeException("Transação não encontrado!");
		} else {
			throw new RuntimeException("Não existe transação realizada!");
		}
	}

	@Override
	public Transacao pagamento(Transacao transacao) {
		if (!transacoes.isEmpty()) {
			for (Transacao list : transacoes) {
				if (list.getId().equals(transacao.getId())) {
					throw new RuntimeException("Transação já realizada com esse id");
				}
			}
		}
		transacao.getCartao();
		transacao.getId();
		transacao.getDescricao().getValor();
		transacao.getDescricao().getDataHora();
		transacao.getDescricao().getEstabelecimento();
		transacao.getFormapagamento().getTipo();
		transacao.getFormapagamento().getParcelas();
		return transacao;
	}

	@Override
	public Transacao respostaPagamento(Transacao transacao) {
		if (transacao.getDescricao().getStatus() == StatusEnum.AUTORIZADO) {

			transacao.getCartao();
			transacao.getId();
			transacao.getDescricao().getValor();
			transacao.getDescricao().getDataHora();
			transacao.getDescricao().getEstabelecimento();
			transacao.getDescricao().getNsu();
			transacao.getDescricao().getCodigoAutorizacao();
			transacao.getDescricao().setStatus(StatusEnum.AUTORIZADO);
			transacao.getFormapagamento().getTipo();
			transacao.getFormapagamento().getParcelas();
			transacoes.add(transacao);
			return transacao;
		} else {
			return estornarPagamento(transacao);
		}

	}

	@Override
	public Transacao estornarPagamento(Transacao transacao) {
		if (transacao.getDescricao().getStatus() == StatusEnum.NEGADO) {

			transacao.getCartao();
			transacao.getId();
			transacao.getDescricao().getValor();
			transacao.getDescricao().getDataHora();
			transacao.getDescricao().getEstabelecimento();
			transacao.getDescricao().getNsu();
			transacao.getDescricao().getCodigoAutorizacao();
			transacao.getDescricao().setStatus(StatusEnum.CANCELADO);
			transacao.getFormapagamento().getTipo();
			transacao.getFormapagamento().getParcelas();
			transacoes.add(transacao);
			return transacao;
		} else {
			throw new RuntimeException("Erro de transacação status: " + StatusEnum.NEGADO);
		}
	}


}
