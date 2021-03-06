package com.example.demo.config;

import com.example.demo.controller.MyInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by admin on 2017/7/17.
 */
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {
    public void  addInterceptors(InterceptorRegistry registry) {
    // 多个拦截器组成一个拦截器链
    // addPathPatterns 用于添加拦截规则
    // excludePathPatterns 用户排除拦截
     registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
     //registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
     super.addInterceptors(registry);
     System.out.print("hahh");
     }
}
