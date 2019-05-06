package com.cotacao.apicotacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiCotacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCotacaoApplication.class, args);
	}

}