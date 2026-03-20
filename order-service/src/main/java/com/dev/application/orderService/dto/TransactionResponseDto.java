package com.dev.application.orderService.dto;


import com.dev.application.orderService.entity.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDto {
    private OrderEntity order;
    private double amount;
    private String transactionId;
    private String response;

//    public TransactionResponseDto(OrderEntity order, double amount, String transactionId, String response) {
//    }
}


//private long paymentId;
//private String paymentStatus;
//private String transactionId;
//private int orderId;
//private double amount;
//private String status;