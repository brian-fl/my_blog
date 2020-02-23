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

    int getArticleCountByState(@Param("state") Integer state, @Param("uid") Long uid, @Param("keywords") String keywords);

    List<Article> getArticleByState(@Param("state") Integer state, @Param("start") int start, @Param("count") Integer count, @Param("uid") Long uid, @Param("keywords") String keywords);

    Article getArticleById(Long aid);

    void pvIncrement(Long aid);

    int deleteArticleById(@Param("aids") Long[] aids);

    int updateArticleState(@Param("aids") Long[] aids, @Param("state") Integer state);
}
