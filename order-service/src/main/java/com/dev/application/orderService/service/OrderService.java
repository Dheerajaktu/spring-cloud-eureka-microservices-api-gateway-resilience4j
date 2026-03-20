package com.dev.application.orderService.service;


import com.dev.application.orderService.dto.PaymentDto;
import com.dev.application.orderService.dto.TransactionResponseDto;
import com.dev.application.orderService.dto.TranscationRequestDto;
import com.dev.application.orderService.entity.OrderEntity;
import com.dev.application.orderService.feignClient.PaymentClient;
import com.dev.application.orderService.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentClient paymentClient;

    public TransactionResponseDto saveOrder(TranscationRequestDto requestDto) {
        String response = "";
        OrderEntity order = requestDto.getOrder();
        PaymentDto payment = requestDto.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        PaymentDto paymentResponse =  paymentClient.callToPaymentService(payment);
        response = paymentResponse.getPaymentStatus().equals("success") ? "SUCCESS" : "FAILURE";

         orderRepository.save(order);
        return new TransactionResponseDto(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);

    }
}
