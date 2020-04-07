package com.jkthy.springcloud.service.impl;

import com.jkthy.springcloud.dao.PaymentDao;
import com.jkthy.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author jk
 * @date 20/4/5 19:51
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
