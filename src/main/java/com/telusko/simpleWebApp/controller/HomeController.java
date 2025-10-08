package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to RG Home";
    }

    @RequestMapping("/about")
    public String about(){
        return "this is about web page";
    }
}
