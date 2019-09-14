package com.itheima.service.impl;

import com.itheima.bean.SCust;
import com.itheima.dao.ScustDao;
import com.itheima.service.ScustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScustDaoImpl implements ScustService {
    @Autowired
    private ScustDao scustDao;
    @Override
    public List<SCust> findAll() {
        return scustDao.findAll();
    }

    @Override
    public void addScust(SCust sCust) {
        scustDao.addScust(sCust);
    }
}
