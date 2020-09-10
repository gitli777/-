package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.entity.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findAll() {
        List<Role> list = roleDao.findAll();
        return list;
    }
}
