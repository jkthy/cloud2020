package com.jkthy.springcloud.alibaba.service;


/**
 * @author jk-thy
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
