package com.hxjc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * creater: 13116
 * create time: 2018/8/11
 * describe:
 */
@Controller
public class HelloController {


    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return " Hello Spring Boot 欢迎学习springboot    ";
    }
}
