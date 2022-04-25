package com.matthew.onespringinitializr.controller;

import ch.qos.logback.core.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Field;

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

    @GetMapping("/hello3")
    public String index3 () {
        return "hello3";
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

    @PostMapping("/login3")
    @ResponseBody
    public String login3 (@RequestParam("file")  MultipartFile file) {

        try {
            System.out.println(file);
                InputStream inputStream = file.getInputStream();
            File file1 = new File("/Users/matthew/Desktop/" + file.getName());
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file1));


        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        return "2";
    }


}
