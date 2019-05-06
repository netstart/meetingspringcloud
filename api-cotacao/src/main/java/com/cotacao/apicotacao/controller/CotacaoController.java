package com.cotacao.apicotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cotacao.apicotacao.model.Cotacao;
import com.cotacao.apicotacao.service.CotacaoService;

@RequestMapping("/moeda")
@RestController
@CrossOrigin(origins = "*")
public class CotacaoController {
	
	@Autowired
	private CotacaoService cotacaoService;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/{paisOrigem}/{paisDestino}")
	public ResponseEntity<Cotacao> findCotacao(@PathVariable("paisOrigem") String paisOrigem, @PathVariable("paisDestino") String paisDestino){
		Cotacao cotacao = cotacaoService.findCotacao(paisOrigem, paisDestino);
		cotacao.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ResponseEntity.ok().body(cotacao);
	}

}
