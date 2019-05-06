package com.compra.apicompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.compra.apicompra")
public class ApiCompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCompraApplication.class, args);
	}

}
