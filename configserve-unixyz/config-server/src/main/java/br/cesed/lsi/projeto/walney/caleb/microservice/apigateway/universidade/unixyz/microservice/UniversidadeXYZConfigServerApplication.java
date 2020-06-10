package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.unixyz.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class UniversidadeXYZConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversidadeXYZConfigServerApplication.class, args);
	}
}
