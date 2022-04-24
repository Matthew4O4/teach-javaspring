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
    public String index () {
        return "hello";
    }

    @GetMapping("/hello2")
    public String index2 () {
        return "hello2";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login (String name, String password) {
        System.out.printf(name + "" + password);
        return "1";
    }

    @PostMapping("/login2")
    @ResponseBody
    public String login2 (@RequestBody User user) {
        System.out.printf(user.toString());
        return "2";
    }


}
