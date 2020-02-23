package com.my.vblog.utils;

import com.my.vblog.bean.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @program: my_vblog
 * @description:
 * @author: chengjun
 * @create: 2020-02-23 11:57
 */
public class Util {
    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
