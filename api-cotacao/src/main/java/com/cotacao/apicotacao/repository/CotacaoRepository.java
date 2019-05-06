package com.cotacao.apicotacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cotacao.apicotacao.model.Cotacao;

public interface CotacaoRepository extends JpaRepository<Cotacao, Long> {

	@Query("Select c from Cotacao c where c.paisOrigem = ?1 and c.paisDestino = ?2")
	Cotacao findByPaisDestinoMoeda(String paisOrigem, String paisDestino);
}
