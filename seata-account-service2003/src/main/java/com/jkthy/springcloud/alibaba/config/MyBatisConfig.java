package com.jkthy.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author jk-thy
 */
@Configuration
@MapperScan({"com.jkthy.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
