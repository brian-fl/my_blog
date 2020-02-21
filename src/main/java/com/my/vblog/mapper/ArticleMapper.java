package com.my.vblog.mapper;

import com.my.vblog.bean.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-19 08:15
 */
@Mapper
public interface ArticleMapper {
    int addNewArticle(Article article);

    int updateArticle(Article article);
}
