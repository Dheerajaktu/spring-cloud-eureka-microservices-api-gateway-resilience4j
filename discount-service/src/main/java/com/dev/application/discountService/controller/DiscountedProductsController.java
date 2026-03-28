package com.dev.application.discountService.controller;


import com.dev.application.discountService.dto.ProductsDto;
import com.dev.application.discountService.entity.DiscountedProducts;
import com.dev.application.discountService.repository.DiscountedProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/discount")
public class DiscountedProductsController {

    @Autowired
    private DiscountedProductsRepository repository;



    /*
    * NOTE - Not using service layer here not recommended in production this is just for demo purpose!
    * */
    @GetMapping("/all")
    public List<ProductsDto> getDiscountedProducts() {
        List<DiscountedProducts> data = repository.findAll();
        return data.stream()
                .map(p -> ProductsDto.builder()
                        .id(p.getId())
                        .name(p.getName())
                        .category(p.getCategory())
                        .color(p.getColor())
                        .price(p.getPrice())
                        .discount(p.getDiscount())
                        .build()
                )
                .toList();
    };

}
