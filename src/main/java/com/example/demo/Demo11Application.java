package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //这个就是扫描相应的Servlet包;
public class Demo11Application {
	/**
	 * 1.若添加了@ServletComponentScan，则不需@Bean实例
	 * 2.若加载@ServletComponentScan，则需在类上注解
	 * 		@WebServlet(urlPatterns = "/xxxx/*" ,description = "xxx")
	 * @param args
	 */
	/*@Bean
	public ServletRegistrationBean MyServlet(){
	 return new ServletRegistrationBean(new MyServlet(),"/myServlet*//*");
	 }*/
	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
		System.out.print("hello world 123456!");
	}
}
