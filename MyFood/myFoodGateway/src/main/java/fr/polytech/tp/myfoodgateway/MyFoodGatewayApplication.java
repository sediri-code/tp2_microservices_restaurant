package fr.polytech.tp.myfoodgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyFoodGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFoodGatewayApplication.class, args);
	}

}
