package com.my.vblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-23 13:59
 */
@Mapper
public interface TagsMapper {
    int deleteTagsByAid(Long aid);

    int saveTags(@Param("tags") String[] tags);

    List<Long> getTagsIdByTagName(@Param("tagNames") String[] tagNames);

    int saveTags2ArticleTags(@Param("tagIds") List<Long> tagIds, @Param("aid") Long aid);
}
