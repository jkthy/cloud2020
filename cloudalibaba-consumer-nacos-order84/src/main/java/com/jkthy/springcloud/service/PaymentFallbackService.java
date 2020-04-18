package com.jkthy.springcloud.service;

import com.jkthy.springcloud.entities.CommonResult;
import com.jkthy.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author jk-thy
 * @date 20/4/18 19:59
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}