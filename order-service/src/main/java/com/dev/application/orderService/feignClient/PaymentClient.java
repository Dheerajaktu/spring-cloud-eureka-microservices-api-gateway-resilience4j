package com.dev.application.orderService.feignClient;


import com.dev.application.orderService.dto.PaymentDto;
import com.dev.application.orderService.dto.TransactionResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



//url="PAYMENT-SERVICE/api/payment"
@FeignClient(name="PAYMENT-SERVICE", path="/payment")
public interface PaymentClient {

    @PostMapping("/make-payment")
    PaymentDto callToPaymentService(@RequestBody PaymentDto paymentDto);
}
