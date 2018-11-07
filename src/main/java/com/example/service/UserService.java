package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: n
 * @Date: 2018/11/7 21:13
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public PageInfo<User> findUserList(int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        List<User> userList = userMapper.findUserList();
        PageInfo<User> pageInfoUserList = new PageInfo<User>(userList);
        return pageInfoUserList;
    }
}
