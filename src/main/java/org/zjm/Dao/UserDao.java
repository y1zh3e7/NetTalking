package org.zjm.Dao;

import org.zjm.pojo.User;

import java.util.List;

public interface UserDao  {

    List<User> getUserList(); //返回的是数据库表的实体类
}