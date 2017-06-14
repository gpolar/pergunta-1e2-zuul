package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Esta classe inicia o Zuul para servir de router dos serviços de registrados
 * no eureka
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contato@gustavopolarsa.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationZuul {
	public static void main(String[] args) {

		SpringApplication.run(ApplicationZuul.class, args);
	}
}