package com.dev.application.catelogService.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductsFallbackDto {
    private int id;
    private String name;
    private String category;
    private String color;
    private int price;
}
