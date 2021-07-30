package com.roncoo.eshop.one.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.eshop.one.service.EshopInventoryService;

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {

    @Override
    public String findByProductId(Long productId) {
        return "降级了的库存数据";
    }

}
