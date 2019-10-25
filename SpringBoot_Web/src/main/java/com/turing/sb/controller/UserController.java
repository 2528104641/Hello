package com.turing.sb



























        .controller;

import com.turing.sb.entity.User;
import com.turing.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //访问主页
    @GetMapping("/index")
    public String index(){ return "index"; }

    //登录页面
    @GetMapping("/")
    public String login(){ return "login"; }




    //登录验证
    @PostMapping("/login")
    public String login(User user, HttpSession session){
        user=userService.login(user);
        if(user == null){

            //不能登录，回到登录页面
            return "redirect:/";

        }else{
            //保存Session
            session.setAttribute("user",user);
            //登录成功，进入主页
            return "redirect:/index";
        }


    }



}
