package com.itheima.dao;

import com.itheima.bean.SCust;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ScustDao {
    @Select("SELECT * FROM s_cust")
    List<SCust> findAll();

    @Insert("insert into s_cust values (null,#{cust_name},#{cust_type},#{cust_phone},#{cust_address},#{cust_link_user})")
    void addScust(SCust sCust);
}
