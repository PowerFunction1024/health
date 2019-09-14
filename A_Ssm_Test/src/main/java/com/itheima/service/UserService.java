package com.itheima.service;

import com.itheima.bean.SCust;
import com.itheima.bean.SUser;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface UserService {

    SUser checkLogin( Map<String,Object> map);

    List<SUser> findAllUser();

    List<SCust> searchMoHu(Map<String,Object> map);


}
