package com.hxjc.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * creater: 13116
 * create time: 2018/8/12
 * describe:
 */
@Controller
public class ConfigInfoController {

    @Value("${boot.name}")
    private String name;
    @RequestMapping("/boot/config")
    public @ResponseBody
    String config(){
        return name;
    }
}
