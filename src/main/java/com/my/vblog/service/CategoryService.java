package com.my.vblog.service;

import com.my.vblog.bean.Category;
import com.my.vblog.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-29 16:04
 */
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }
}
