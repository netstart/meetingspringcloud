package com.namingserver.apinaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiNamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNamingApplication.class, args);
	}

}
