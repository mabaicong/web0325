package com.neuedu.service.user;

import com.neuedu.pojo.User;

import java.util.List;

/**
 * Created by mabaicong on 2019/3/29.
 */
public interface UserService {
    User login(User user);
    int add(User user);
    int batch(List<User> users);
    List<User> list();
}
