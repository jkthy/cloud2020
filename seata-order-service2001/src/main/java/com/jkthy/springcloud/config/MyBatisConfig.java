package com.jkthy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author jk-thy
 */
@Configuration
@MapperScan({"com.jkthy.springcloud.dao"})
public class MyBatisConfig {
}
