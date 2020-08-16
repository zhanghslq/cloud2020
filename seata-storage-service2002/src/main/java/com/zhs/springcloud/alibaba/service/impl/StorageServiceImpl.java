package com.zhs.springcloud.alibaba.service.impl;

import com.zhs.springcloud.alibaba.dao.StorageDao;
import com.zhs.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhs
 * @date: 2020/4/12 13:02
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId,count);

    }
}
