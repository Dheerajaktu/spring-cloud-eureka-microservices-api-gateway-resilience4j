package com.dev.application.catelogService.bootstrap;


import com.dev.application.catelogService.entity.Products;
import com.dev.application.catelogService.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {


    //dependency injection automatically via method parameters here
    @Bean
    CommandLineRunner loadDataInH2InMemDb(ProductRepository repository){
        return  args -> {
            repository.save(new Products(119, "LED TV", "electronics", "white", 45000));
            repository.save(new Products(345, "Headset", "electronics", "black", 7000));
            repository.save(new Products(475, "Sound bar", "electronics", "black", 13000));
            repository.save(new Products(574, "Puma Shoes", "foot wear", "black & white", 4600));
            repository.save(new Products(678, "Vegetable chopper", "kitchen", "blue", 999));
            repository.save(new Products(532, "Oven Gloves", "kitchen", "gray", 745));

            System.out.println("Sample products loaded into H2 DB.....!!!");
        };

    }

}
