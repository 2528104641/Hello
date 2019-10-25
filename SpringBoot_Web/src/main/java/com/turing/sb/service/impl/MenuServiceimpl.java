package com.turing.sb.service.impl;

import com.turing.sb.entity.Menu;
import com.turing.sb.mapper.MenuMapper;
import com.turing.sb.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceimpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> findAll() {

        //获取一级菜单
        List<Menu> menus = menuMapper.findAll();

        //遍历一级菜单
        for (Menu menu:menus
             ) {
            menu.setChildren(menuMapper.findById(menu.getId()));

        }
        return menus;
    }
}
