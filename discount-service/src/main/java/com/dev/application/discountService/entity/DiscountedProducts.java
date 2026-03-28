package com.dev.application.discountService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountedProducts {

    @Id
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
    private String discount;
}
