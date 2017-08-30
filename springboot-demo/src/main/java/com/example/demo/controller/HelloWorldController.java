package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/30.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String test(){
        return "springboot demo !";
    }
}
