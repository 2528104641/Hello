package com.turing.sb.service.impl;

import com.turing.sb.entity.Dept;
import com.turing.sb.mapper.DeptMapper;
import com.turing.sb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceimpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept findById(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }



}
