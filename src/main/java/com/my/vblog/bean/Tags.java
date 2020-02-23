package com.my.vblog.bean;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * Created by chengjun on 2020/02/18.
 */
@Getter
@Setter
@Alias("Tags")
public class Tags {
    private Long id;
    private String tagName;
}
