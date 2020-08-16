package com.zhs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhs
 * @date: 2020/3/28 21:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer id;
    private String serial;
}
