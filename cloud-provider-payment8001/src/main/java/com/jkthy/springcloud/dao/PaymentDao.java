package com.jkthy.springcloud.dao;

import com.jkthy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jk
 * @date 20/4/5 19:37
 */
@Mapper
public interface PaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment getPaymentById(@Param("id") Long id);


    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 影响行数
     */
    int create(Payment payment);


}