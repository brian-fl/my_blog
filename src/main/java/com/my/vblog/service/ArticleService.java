package com.my.vblog.service;

import com.my.vblog.bean.Article;
import com.my.vblog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-19 23:10
 */
@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public int addNewArticle(Article article) {
        return 0;
    }
}
