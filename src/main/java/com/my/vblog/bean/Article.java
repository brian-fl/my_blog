package com.my.vblog.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by chengjun on 2020/02/18.
 */
@Getter
@Setter
public class Article {
    private Long id;
    private String title;
    private String mdContent;
    private String htmlContent;
    private String summary;
    private Long cid;
    private Long uid;
    private Timestamp publishDate;
    private Integer state;
    private Integer pageView;
    private Timestamp editTime;
    private String[] dynamicTags;
    private String nickname;
    private String cateName;
    private List<Tags> tags;
    private String stateStr;
}
