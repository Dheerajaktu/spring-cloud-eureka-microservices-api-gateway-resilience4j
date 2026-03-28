package com.dev.application.catelogService.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountedProductsDto {
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
    private String discount;

}