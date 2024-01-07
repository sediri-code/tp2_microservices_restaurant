package fr.polytech.tp.myfoodconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyFoodConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFoodConfigServerApplication.class, args);
    }

}
