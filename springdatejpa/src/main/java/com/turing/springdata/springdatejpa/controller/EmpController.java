package com.turing.springdata.springdatejpa.controller;

import com.turing.springdata.springdatejpa.dao.EmpRepostory;
import com.turing.springdata.springdatejpa.entity.Dept;
import com.turing.springdata.springdatejpa.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpRepostory repostory;
    //查询所有员工
    @GetMapping("/list")
    public List<Emp> list(){
        List<Emp> list =repostory.findAll();
        return list;
    }

    //2.查询员工表中，工资大于2000，部门为20的员工信息。
    @GetMapping("findwork2/{id}")
    public List<Emp> findwork2(@PathVariable("id")Integer id){
        List<Emp> list2=repostory.findwork2(id);
        return  list2;
    }
    //3.查询员工表中，部门为SALES，奖金高于500，按工资降序排列。
    @GetMapping("/findwork3/{id}")
    public List<Emp> findwork3(@PathVariable("id") Integer id){
        List<Emp> list3=repostory.findwork3(id);
        return  list3;

    }
    //4.查询部门为10的信息，并显示所有员工。
    @GetMapping("/findwork4")
    public List<Emp> findwork4(){
        List<Emp> list4=repostory.findwork4();
        return  list4;

    }
    //5.查询员工为7698的信息，并显示部门。
    @GetMapping("/findwork5")
    public List<Emp> findwork5(){
        List<Emp> list5=repostory.findwork5();
        return  list5;
    }


    //6.增加一个新员工。
    @RequestMapping("/addEmp")
    @ResponseBody
    public Emp addEmp(){
        Emp emp = new Emp();
        emp.setEname("CJF");
        emp.setJob("SALES");
        emp.setMgr(564422);
        Date date = new Date();
        emp.setHiredate(date);
        emp.setSal(478664);
        emp.setComm(5000000);
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("EEE");
        dept.setLoc("changsha");
        emp.setDeptno(dept);
        Emp save = repostory.save(emp);
        return  save;

    }

}
