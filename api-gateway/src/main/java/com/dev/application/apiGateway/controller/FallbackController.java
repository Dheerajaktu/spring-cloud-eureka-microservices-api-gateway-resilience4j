package com.dev.application.apiGateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/order/fallback")
    public String orderServiceFallback() {
            return "Order Service is Down as now, Temporary Fallback";
    }

    @GetMapping("/payment/fallback")
    public String paymentServiceFallback() {
        return "Payment Service is Down as now, Temporary Fallback";
    }

}
