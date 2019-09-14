package com.itheima.service.impl;

import com.itheima.bean.SCust;
import com.itheima.bean.SUser;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public SUser checkLogin( Map<String,Object> map) {
        return userDao.checkLogin(map);
    }

    @Override
    public List<SUser> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public List<SCust> searchMoHu(Map<String, Object> map) {
        return userDao.searchMoHu(map);
    }

}
