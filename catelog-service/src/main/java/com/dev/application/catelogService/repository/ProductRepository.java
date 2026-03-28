package com.dev.application.catelogService.repository;

import com.dev.application.catelogService.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
