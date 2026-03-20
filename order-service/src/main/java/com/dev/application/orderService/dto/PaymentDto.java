package com.dev.application.orderService.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private long paymentId;
    private String paymentStatus;
    private String transactionId;
    private double amount;
    private int orderId;
//    private String status;
}
