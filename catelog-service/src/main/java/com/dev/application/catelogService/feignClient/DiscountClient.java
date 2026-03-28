package com.dev.application.catelogService.feignClient;


import com.dev.application.catelogService.dto.DiscountedProductsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name="DISCOUNT-SERVICE", path="/discount")
public interface DiscountClient {
    @GetMapping("/all")
    public List<DiscountedProductsDto> callToDiscountService();
}
