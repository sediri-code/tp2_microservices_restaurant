package fr.polytech.tp.myfood.courtierservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourtierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourtierServiceApplication.class, args);
	}

}
