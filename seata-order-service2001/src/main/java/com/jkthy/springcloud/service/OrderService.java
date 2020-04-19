package com.jkthy.springcloud.service;

import com.jkthy.springcloud.domain.Order;


/**
 * @author jk-thy
 */
public interface OrderService
{
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
