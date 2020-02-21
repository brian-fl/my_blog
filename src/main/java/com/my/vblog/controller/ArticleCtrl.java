package com.my.vblog.controller;

import com.my.vblog.bean.Article;
import com.my.vblog.bean.RespBean;
import com.my.vblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-19 23:09
 */
@RestController
@RequestMapping("/article")
public class ArticleCtrl {

    @Autowired
    ArticleService articleService;

    @PostMapping("/")
    public RespBean addNewArticle(@RequestBody Article article) {
        int result = articleService.addNewArticle(article);
        if (result == 1) {
            return new RespBean("success", article.getId() + "");
        } else {
            return new RespBean("error", article.getState() == 0 ? "文章保存失败!" : "文章发表失败!");
        }
    }
}
