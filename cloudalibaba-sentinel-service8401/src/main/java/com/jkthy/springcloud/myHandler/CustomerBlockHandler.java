package com.jkthy.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jkthy.springcloud.entities.CommonResult;

/**
 * @author jk-thy
 * @date 20/4/18 15:50
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
