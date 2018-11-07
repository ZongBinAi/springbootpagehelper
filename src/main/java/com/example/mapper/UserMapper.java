package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: n
 * @Date: 2018/11/7 21:09
 * @Description:
 */
public interface UserMapper {
    @Select("select * from USERS")
    List<User> findUserList();
}
