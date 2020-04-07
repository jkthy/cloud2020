package com.jkthy.springcloud.controller;

import com.jkthy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author jk-thy
 * @date 20/4/6 16:10
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String create(Payment payment) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }
}