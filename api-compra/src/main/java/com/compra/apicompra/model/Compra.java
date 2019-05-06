package com.compra.apicompra.model;

import java.math.BigDecimal;

public class Compra {

	private BigDecimal total;
	private int port;
	
	public Compra() {
		
	}
	
	public Compra(BigDecimal total, int port) {
		super();
		this.total = total;
		this.port = port;
	}

	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
