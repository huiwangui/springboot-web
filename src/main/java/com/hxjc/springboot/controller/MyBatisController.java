package com.hxjc.springboot.controller;

import com.hxjc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * creater: 13116
 * create time: 2018/8/12
 * describe:@RestController 用于返回字符串或json数据
 */
@RestController
public class MyBatisController {

    @Autowired
    StudentService studentService;

    @GetMapping("/boot/students")
    public Object getStudents(){
        
       return studentService.getAllStudent();
    }
}
