package com.zhs.springcloud.alibaba.service;

/**
 * @author: zhs
 * @date: 2020/4/12 13:02
 */
public interface StorageService {
    void decrease(Long productId,Integer count);
}
