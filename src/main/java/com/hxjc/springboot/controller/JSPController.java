package com.hxjc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * creater: 13116
 * create time: 2018/8/12
 * describe:
 */
@Controller
public class JSPController {

    @GetMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","spring boot 集成 jsp");
        return "index";
    }

}
