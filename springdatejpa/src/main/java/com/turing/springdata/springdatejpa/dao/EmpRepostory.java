package com.turing.springdata.springdatejpa.dao;

import com.turing.springdata.springdatejpa.entity.Emp;
import com.turing.springdata.springdatejpa.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpRepostory extends JpaRepository<Emp,Integer> {

   // 作业二、2.查询员工表中，工资大于2000，部门为20的员工信息。
    @Query("select e from  Emp e where e.sal>:eno and e.deptno=20 ")
    public List<Emp> findwork2(@Param("eno") Integer id);

    //作业三、3.查询员工表中，部门为SALES，奖金高于500，按工资降序排列。
    @Query("select e from Emp e where e.comm>:eno and e.deptno=(select d.deptno from  Dept d where d.dname='SALES') order by e.sal desc")
    public List<Emp> findwork3(@Param("eno") Integer id);


    //作业四、1.查询部门为10的信息，并显示所有员工。
    @Query("select e from Emp e where e.deptno=10")
    public List<Emp> findwork4();
    /*public List<Emp> findwork4(@Param("eno") Integer id);*/

    //作业五、2.查询员工为7698的信息，并显示部门。
    @Query("select e from  Emp e where e.empno=7698")
    public List<Emp> findwork5();



}
