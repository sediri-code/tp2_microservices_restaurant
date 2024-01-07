package fr.polytech.fr.myfood.myfoodregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyFoodRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFoodRegistryApplication.class, args);
	}

}
