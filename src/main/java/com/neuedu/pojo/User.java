package com.neuedu.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by mabaicong on 2019/3/29.
 */
@Data
public class User {
    private Integer id;
    private String loginId;
    private String name;
    private String phone;
    private String password;
    private Integer sex;
    private Date birthday;
    private String email;
    private String address;
    private Integer isDel;
}
