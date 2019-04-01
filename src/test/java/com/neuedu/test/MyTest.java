package com.neuedu.test;

import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mabaicong on 2019/3/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    UserService userService;
    @Test
    public void method() {

        List<User> users = new ArrayList<>();
        for (int i=1;i<=100;i++) {
            User user = new User();
            user.setLoginId("u"+i);
            user.setName("n"+i);
            user.setSex(0);
            user.setEmail("dasgas@qq.com");
            user.setPhone("123"+i);
            user.setPassword("88888");
            user.setBirthday(new Date());
            user.setAddress("address"+i);
            user.setIsDel(1);
            users.add(user);
        }
        System.out.println(userService.batch(users));
    }
}
