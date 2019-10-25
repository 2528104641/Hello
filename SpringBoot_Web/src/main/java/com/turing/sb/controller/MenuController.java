package com.turing.sb.controller;

import com.turing.sb.entity.Menu;
import com.turing.sb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    //获取所有菜单
    @GetMapping("/findAll")
    @ResponseBody
    public List<Menu> findAll(){

        return menuService.findAll();

    }

}
