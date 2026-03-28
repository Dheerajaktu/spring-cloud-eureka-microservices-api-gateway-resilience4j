package com.dev.application.catelogService.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCTS_TBL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products {
    @Id
    private int id;
    private String name;
    private String category;
    private String color;
    private int price;

//    public Product(int id, String name, String category, String color, int price) {
//        this.id = id;
//        this.name = name;
//        this.category = category;
//        this.color = color;
//        this.price = price;
//    }

    // getters & setters
}
