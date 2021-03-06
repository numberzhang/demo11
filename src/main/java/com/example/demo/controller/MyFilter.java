package com.example.demo.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * 使用注解标注过滤器
  * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
  * 属性filterName声明过滤器的名称,可选
  * 属性urlPatterns指定要过滤的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * Created by admin on 2017/7/17.
 */
@WebFilter(filterName = "myFilter",urlPatterns = "/*" )
public abstract class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
             System.out.println("过滤器初始化.......");

    }

     public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException{
                System.out.println("执行过滤操作....");
                 chain.doFilter(request, response);

    }
    public void destroy() {
                 System.out.println("过滤器销毁!!!!!!");

             }
}
