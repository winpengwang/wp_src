package com.example.springbootdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wp")
public class controllerDemo {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "ceshi") String sf){
        return sf+"hello world!";
    }
}
