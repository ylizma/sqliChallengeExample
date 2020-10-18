package com.ylizma.ci_cd_pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String helloName(@RequestParam(name = "name") String name){
        return String.format("hello, %s",name);
    }

}
