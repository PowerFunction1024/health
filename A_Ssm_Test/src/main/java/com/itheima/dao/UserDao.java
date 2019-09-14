package com.itheima.dao;

import com.itheima.bean.SCust;
import com.itheima.bean.SUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from s_user where username=#{username} and password=#{password}")
    SUser checkLogin( Map<String,Object> map);


    @Select("select * from s_user")
    List<SUser> findAllUser();



//    @Select("SELECT * FROM s_cust WHERE cust_name LIKE CONCAT('%',#{custName},'%') and cust_type like CONCAT('%',#{custType},'%')")
    @Select("SELECT * FROM s_cust WHERE cust_name like '%${custName}%' and cust_type like '%${custType}%'")
    List<SCust> searchMoHu(Map<String,Object> map);




}
