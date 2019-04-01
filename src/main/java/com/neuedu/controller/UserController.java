package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mabaicong on 2019/3/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap) {
        modelMap.addAttribute("list",UserService.list());
        return "user/list";
    }
}
