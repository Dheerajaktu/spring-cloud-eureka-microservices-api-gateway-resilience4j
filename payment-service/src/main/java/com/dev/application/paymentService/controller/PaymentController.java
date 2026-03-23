package com.dev.application.paymentService.controller;


import com.dev.application.paymentService.entity.PaymentEntity;
import com.dev.application.paymentService.repository.PaymentRepository;
import com.dev.application.paymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/make-payment")
    public PaymentEntity doPayment(@RequestBody PaymentEntity paymentEntity) {
        return paymentService.savePayment(paymentEntity);
    }


}
