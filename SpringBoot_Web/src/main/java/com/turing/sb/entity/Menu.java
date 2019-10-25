package com.turing.sb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Menu {
    private Integer id;


    @JsonProperty(value = "text") //当序列化JSON时，会把name变成text
    private String name;


    private Integer pid;


    private List<Menu> children;//子菜单

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
