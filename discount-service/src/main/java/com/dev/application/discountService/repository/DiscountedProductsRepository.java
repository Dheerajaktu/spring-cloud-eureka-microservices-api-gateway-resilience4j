package com.dev.application.discountService.repository;

import com.dev.application.discountService.entity.DiscountedProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountedProductsRepository extends JpaRepository<DiscountedProducts, Long> {
}
