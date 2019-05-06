package com.cotacao.apicotacao.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cotacao")
public class Cotacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String paisOrigem;
	private String paisDestino;
	private BigDecimal valorMoedaDestino;
	private int port;
	
	
	public Cotacao() {
		
	}

	public Cotacao(Long id, String paisOrigem, String paisDestino, BigDecimal valorMoedaDestino, int port) {
		this.id = id;
		this.paisOrigem = paisOrigem;
		this.paisDestino = paisDestino;
		this.valorMoedaDestino = valorMoedaDestino;
		this.port = port;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotacao other = (Cotacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
