package com.compra.apicompra.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compra.apicompra.dto.CompraDto;
import com.compra.apicompra.model.Compra;
import com.compra.apicompra.service.CompraService;

@RestController
@RequestMapping("/test")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@GetMapping("/{paisOrigem}/{paisDestino}/{qtde}")
	public ResponseEntity<Compra> findCotacao(@PathVariable("paisOrigem") String paisOrigem, @PathVariable("paisDestino") String paisDestino, @PathVariable("qtde") Double qtd){
		CompraDto compraDto = compraService.cotarMoeda(paisOrigem, paisDestino);
		BigDecimal total = compraDto.getValorMoedaDestino().multiply(new BigDecimal(qtd));
		Compra c = new Compra(total, compraDto.getPort());
		return ResponseEntity.ok().body(c);
	}

}
