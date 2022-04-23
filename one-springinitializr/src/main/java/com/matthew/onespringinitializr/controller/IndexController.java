package com.matthew.onespringinitializr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyunpo
 */
@Controller
@RequestMapping
public class IndexController {
    @GetMapping("/hello")
    public String index(){
        return "hello";
    }

    @PostMapping("/login")
    @ResponseBody
    public String lgoin(String name,String password){
        System.out.printf("hhhh");
        return name + "   " +password;
    }
}
