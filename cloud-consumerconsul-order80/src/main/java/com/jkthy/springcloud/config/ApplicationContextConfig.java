package com.jkthy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author jk-thy
 * @date 20/4/6 17:12
 */
@Configuration
public class ApplicationContextConfig {

    /**
     *
     赋予RestTemplate负载均衡的能力
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
