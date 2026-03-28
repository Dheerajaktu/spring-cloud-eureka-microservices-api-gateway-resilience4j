package com.dev.application.catelogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class CatelogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatelogServiceApplication.class, args);
	}

}
