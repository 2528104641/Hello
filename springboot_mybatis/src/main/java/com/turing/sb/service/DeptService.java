package com.turing.sb.service;

import com.turing.sb.entity.Dept;

public interface DeptService {
    /**
     * 根据id查询部门
     * @param id
     * @return Dept
     */
    public Dept findById(Integer id);



}
