package com.roncoo.eshop.one.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.eshop.one.service.EshopPriceService;

@Component
public class EshopPriceServiceFallback implements EshopPriceService {

    @Override
    public String findByProductId(Long productId) {
        return "降级了的价格数据";
    }

}
