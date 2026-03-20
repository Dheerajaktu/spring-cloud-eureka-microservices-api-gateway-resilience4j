package com.dev.application.serviceRegistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegisteryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegisteryServerApplication.class, args);
	}

}
