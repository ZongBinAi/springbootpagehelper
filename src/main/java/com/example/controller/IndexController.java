package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: n
 * @Date: 2018/11/7 21:23
 * @Description:
 */

@RestController
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/findUserList")
    public PageInfo<User> findUserList(int page, int pagesize) {
        return userService.findUserList(page, pagesize);
    }
}
