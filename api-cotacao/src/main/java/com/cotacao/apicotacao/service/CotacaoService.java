package com.cotacao.apicotacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotacao.apicotacao.model.Cotacao;
import com.cotacao.apicotacao.repository.CotacaoRepository;

@Service
public class CotacaoService {

	@Autowired
	private CotacaoRepository cotacaoRepository;
	
	public Cotacao findCotacao(String paisOrigem, String paisDestino) {
		return cotacaoRepository.findByPaisDestinoMoeda(paisOrigem, paisDestino);
	}
}
