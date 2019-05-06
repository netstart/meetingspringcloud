package com.compra.apicompra.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.compra.apicompra.dto.CompraDto;

@FeignClient(name="gateway")
@RibbonClient(name= "cotacao")
public interface CompraService {
	
	@GetMapping("/cotacao/moeda/{paisOrigem}/{paisDestino}")
	CompraDto cotarMoeda(@PathVariable("paisOrigem") String paisOrigem, @PathVariable("paisDestino") String paisDestino);

}
