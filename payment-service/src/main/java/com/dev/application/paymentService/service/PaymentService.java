package com.dev.application.paymentService.service;


import com.dev.application.paymentService.entity.PaymentEntity;
import com.dev.application.paymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentEntity savePayment(PaymentEntity paymentEntity) {
        //setPaymentStatus() we will call this method in future
        // that will basically set the payment status mock on 3rd party payment service like PayPal, paytm etc.
        paymentEntity.setPaymentStatus(paymentProcessing());
        paymentEntity.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(paymentEntity);
    }

    public String paymentProcessing(){
        //api should be 3rd party payment gateway (paypal,paytm...)
        return new Random().nextBoolean()?"success":"false";
    }
}

