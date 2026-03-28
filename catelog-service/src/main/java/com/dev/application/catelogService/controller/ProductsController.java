package com.dev.application.catelogService.controller;

import com.dev.application.catelogService.dto.DiscountedProductsDto;
import com.dev.application.catelogService.feignClient.DiscountClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private DiscountClient discountClient;

    public ProductsController(DiscountClient discountClient) {
        this.discountClient = discountClient;
    }

    @GetMapping("/all")
    DiscountedProductsDto getAllProductsIncludingDiscouts(){
        DiscountedProductsDto  discountedProductsDto = discountClient.callToDiscountService();
        return discountedProductsDto;
    }

}
