package com.dev.application.orderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class OrderServiceApplication {
//    System.out.println("!!====ORDER SERVICE IS RUNNNING====!!");
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
