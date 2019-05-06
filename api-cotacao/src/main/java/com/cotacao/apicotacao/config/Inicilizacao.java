package com.cotacao.apicotacao.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cotacao.apicotacao.model.Cotacao;
import com.cotacao.apicotacao.repository.CotacaoRepository;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Inicilizacao implements CommandLineRunner{

	@Autowired
	private CotacaoRepository cotacaoRepository;

	@Override
	public void run(String... args) throws Exception {
		Cotacao c1 = new Cotacao(null, "BRA", "EUA", new BigDecimal(4.20), 0);
		Cotacao c2 = new Cotacao(null, "BRA", "ING", new BigDecimal(5.80), 0);
		
		cotacaoRepository.saveAll(Arrays.asList(c1, c2));
	}
}
;