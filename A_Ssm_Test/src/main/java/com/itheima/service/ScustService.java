package com.itheima.service;

import com.itheima.bean.SCust;
import com.itheima.dao.ScustDao;

import java.util.List;

public interface ScustService {
    List<SCust> findAll();

    void addScust(SCust sCust);
}

