package com.turing.sb.configuration;

import com.turing.sb.interceptors.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//web配置项
@Configuration
public class WebConfig implements WebMvcConfigurer {

    //注册拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")//拦截所有
//                .excludePathPatterns("/css/**","/js/**","/","/login");//例外的，不需要拦截的资源
//    }

    //批量配置视图控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/easyui").setViewName("easyui");
        registry.addViewController("/login2").setViewName("login2");
        registry.addViewController("/layout").setViewName("layout");
        registry.addViewController("/nav").setViewName("nav");
        registry.addViewController("/nav2").setViewName("nav2");
        registry.addViewController("/nav3").setViewName("nav3");
        //...
    }
}
