package com.turing.sb.interceptors;

import com.turing.sb.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器
public class LoginInterceptor implements HandlerInterceptor {

    //在控制器执行前会先调用的方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if(user==null){
            //重定向到登录页面
            response.sendRedirect("/");
            //没有登录，拦截
            return false;
        }else {
            //登录成功，放行
            return true;
        }

    }
}
