package com.dev.application.discountService.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Data
public class ProductsDto {
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
    private String discount;


    public ProductsDto(int id, String name, String category,
                       String color, double price, String discount) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.price = price;
        this.discount = discount;
    }
}

