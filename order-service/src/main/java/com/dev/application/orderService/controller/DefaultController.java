package com.dev.application.orderService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public String defaultMessage() {
        return "Order Service is Running @ PORT: 8800";
    }
}
