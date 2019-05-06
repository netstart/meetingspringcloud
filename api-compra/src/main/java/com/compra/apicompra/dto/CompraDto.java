package com.compra.apicompra.dto;

import java.math.BigDecimal;

public class CompraDto {

	private BigDecimal valorMoedaDestino;
	private int port;
	
	public BigDecimal getValorMoedaDestino() {
		return valorMoedaDestino;
	}
	public void setValorMoedaDestino(BigDecimal valorMoedaDestino) {
		this.valorMoedaDestino = valorMoedaDestino;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
