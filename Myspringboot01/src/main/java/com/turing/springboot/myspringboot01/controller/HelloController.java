package com.turing.springboot.myspringboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(){
    /*   Map<String,String> user = new HashMap<>();
        user.put("username","admin");
        user.put("password","123");*/
      return "HELLO SPRINGBOOT";
       /* return user;*/


    }
}
