package com.dev.application.orderService.dto;
import com.dev.application.orderService.entity.OrderEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranscationRequestDto {
    private OrderEntity order;
    private PaymentDto payment;
}
