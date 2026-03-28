package com.dev.application.discountService.bootstrap;


import com.dev.application.discountService.entity.DiscountedProducts;
import com.dev.application.discountService.repository.DiscountedProductsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadDiscountedProductsInMemDb(DiscountedProductsRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                    new DiscountedProducts(101, "Laptop", "electronics", "gray", 60000, "50%"),
                    new DiscountedProducts(102, "Smartphone", "electronics", "black", 30000, "50%"),
                    new DiscountedProducts(103, "Running Shoes", "foot wear", "blue", 8000, "50%"),
                    new DiscountedProducts(104, "Microwave Oven", "kitchen", "silver", 12000, "50%"),
                    new DiscountedProducts(105, "Bluetooth Speaker", "electronics", "red", 4000, "50%")
            ));

            System.out.println("Discounted products loaded into H2 DB....");
        };

    }
}



