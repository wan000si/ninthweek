package com.example.ninthweek.service;

import com.example.ninthweek.entity.ExpressOrder;

public interface ExpressOrderService {
    ExpressOrder addExpressOrder(ExpressOrder expressOrder);

    ExpressOrder getExpressOrder(Long id);

    String shipProduct(Long id);

    String signProduct(Long id);

}
