package com.roncoo.eshop.one.service.fallback;

import com.roncoo.eshop.one.service.EshopPriceService;
import org.springframework.stereotype.Component;

/**
 * @Author linjingcheng
 * @data 2020/10/25
 */
@Component

public class EshopPriceServiceFallback implements EshopPriceService {
    @Override
    public String findByProductId(Long productId) {
        return "降级价格数据";
    }
}
