package com.jkthy.springcloud.service;

import com.jkthy.springcloud.entities.Payment;

/**
 * @author jk
 * @date 20/4/5 19:50
 */
public interface PaymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment getPaymentById(Long id);


    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 影响行数
     */
    int create(Payment payment);
}
