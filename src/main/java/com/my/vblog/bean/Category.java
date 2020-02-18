package com.my.vblog.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-18 08:11
 */
@Getter
@Setter
public class Category {
    private Long id;
    private String cateName;
    private Timestamp date;
}
