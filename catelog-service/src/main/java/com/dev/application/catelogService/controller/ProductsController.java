package com.dev.application.catelogService.controller;

import com.dev.application.catelogService.dto.DiscountedProductsDto;
import com.dev.application.catelogService.dto.ProductsFallbackDto;
import com.dev.application.catelogService.entity.Products;
import com.dev.application.catelogService.feignClient.DiscountClient;
import com.dev.application.catelogService.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private DiscountClient discountClient;
    private ProductRepository productRepository;

    public ProductsController(DiscountClient discountClient, ProductRepository productRepository) {
        this.discountClient = discountClient;
        this.productRepository = productRepository;
    }

    @GetMapping("/all")
    List<DiscountedProductsDto>  getAllProductsIncludingDiscounts(){
        List<DiscountedProductsDto>  discountedProductsDto = discountClient.callToDiscountService();
        return discountedProductsDto;
    }


    @GetMapping("/fallback")
    List<Products> getFallbackProducts(){
        return productRepository.findAll();
    }


}
