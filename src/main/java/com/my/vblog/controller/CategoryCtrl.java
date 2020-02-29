package com.my.vblog.controller;

import com.my.vblog.bean.Category;
import com.my.vblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: my_vblog
 * @description: 管理员专属controller
 * @author: chengjun
 * @create: 2020-02-29 16:03
 */
@RestController
@RequestMapping("/admin/category")
public class CategoryCtrl {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

}
