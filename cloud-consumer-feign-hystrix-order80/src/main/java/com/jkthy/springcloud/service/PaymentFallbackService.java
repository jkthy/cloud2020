package com.jkthy.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jk-thy
 * @date 20/4/8 15:22
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "--- PaymentFallbackService  fall  paymentInfo_OK vack ，/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--- PaymentFallbackService  fall  paymentInfo_TimeOut， /(ㄒoㄒ)/~~";
    }
}
