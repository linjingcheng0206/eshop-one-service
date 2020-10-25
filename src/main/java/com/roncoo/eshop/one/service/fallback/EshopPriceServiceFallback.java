package com.roncoo.eshop.one.service.fallback;

import com.roncoo.eshop.one.service.EshopInventoryService;

/**
 * @Author linjingcheng
 * @data 2020/10/25
 */
public class EshopPriceServiceFallback implements EshopInventoryService {
    @Override
    public String findByProductId(Long productId) {
        return "降级价格数据";
    }
}
