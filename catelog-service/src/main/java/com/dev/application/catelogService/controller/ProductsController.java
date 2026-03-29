package com.dev.application.catelogService.controller;

import com.dev.application.catelogService.dto.DiscountedProductsDto;
import com.dev.application.catelogService.dto.ProductsFallbackDto;
import com.dev.application.catelogService.entity.Products;
import com.dev.application.catelogService.feignClient.DiscountClient;
import com.dev.application.catelogService.repository.ProductRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private static final String DISCOUNT_SERVICE = "DISCOUNT-SERVICE";
    private int retryAttemptCount = 0;
    private DiscountClient discountClient;
    private ProductRepository productRepository;

    public ProductsController(DiscountClient discountClient, ProductRepository productRepository) {
        this.discountClient = discountClient;
        this.productRepository = productRepository;
    }


    // Main API with Circuit Breaker
    @GetMapping("/all")
    @Retry(name="DISCOUNT-SERVICE", fallbackMethod = "getFallbackProducts")
    //@CircuitBreaker(name="DISCOUNT_SERVICE", fallbackMethod = "getFallbackProducts")
    List<DiscountedProductsDto>  getAllProductsIncludingDiscounts(){
        System.out.println("Retry attempt discount service===="+ retryAttemptCount);
        List<DiscountedProductsDto>  discountedProductsDto = discountClient.callToDiscountService();
        return discountedProductsDto;
    }

    // Fallback Method (IMPORTANT: same return type + Throwable param)
    @GetMapping("/fallback")
    List<Products> getFallbackProducts(Throwable ex){
        System.out.println("Discount service failed, using fallback. Reason: ====>>>" + ex.getMessage());
        return productRepository.findAll();
    }


}
