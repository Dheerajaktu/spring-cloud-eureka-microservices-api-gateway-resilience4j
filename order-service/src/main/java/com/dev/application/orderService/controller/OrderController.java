package com.dev.application.orderService.controller;


import com.dev.application.orderService.dto.PaymentDto;
import com.dev.application.orderService.dto.TransactionResponseDto;
import com.dev.application.orderService.dto.TranscationRequestDto;
import com.dev.application.orderService.entity.OrderEntity;
import com.dev.application.orderService.service.OrderService;
import jakarta.persistence.criteria.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create-order")
    public TransactionResponseDto bookOrder(@RequestBody TranscationRequestDto request) {
        log.info("===Called Create-Order===Controller===>>"+ request.toString());
        return orderService.saveOrder(request);
    }

}
