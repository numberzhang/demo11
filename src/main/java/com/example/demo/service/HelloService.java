package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 *
*   启动的时候观察控制台是否打印此信息;
 * Created by admin on 2017/7/17.
 */
@Service
public class HelloService {
    public HelloService() {
        System.out.println("HelloService.HelloService");
        System.out.println("HelloService.HelloService");
        System.out.println("HelloService.HelloService");

    }
}
