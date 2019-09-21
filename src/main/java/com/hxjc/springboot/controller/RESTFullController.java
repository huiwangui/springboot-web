package com.hxjc.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * creater: 13116
 * create time: 2018/8/15
 * describe:
 */
@RestController
public class RESTFullController {
    //http://localhost:8090/boot/rest/25
    @RequestMapping("/boot/rest/{id}")
    public Object getPathId(@PathVariable("id") Integer id){
        
        return id;
    }
}
