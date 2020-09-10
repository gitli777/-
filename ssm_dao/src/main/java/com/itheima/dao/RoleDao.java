package com.itheima.dao;

import com.itheima.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao {
    @Select("select * form pe_role")
    List<Role>findAll();
}
