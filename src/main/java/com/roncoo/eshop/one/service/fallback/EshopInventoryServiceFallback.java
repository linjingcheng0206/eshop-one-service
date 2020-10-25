package com.roncoo.eshop.one.service.fallback;

import com.roncoo.eshop.one.service.EshopInventoryService;
import org.springframework.stereotype.Component;

/**
 * @Author linjingcheng
 * @data 2020/10/25
 */
@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
    @Override
    public String findByProductId(Long productId) {
        return "降级库存数据";
    }
}
