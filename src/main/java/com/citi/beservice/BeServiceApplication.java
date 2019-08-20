package com.citi.beservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class BeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeServiceApplication.class, args);
	}

}
