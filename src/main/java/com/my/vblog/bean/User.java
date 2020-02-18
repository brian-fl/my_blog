package com.my.vblog.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-18 08:15
 */
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private boolean enabled;
    private List<Role> roles;
    private String email;
    private String userface;
    private Timestamp regTime;
}
