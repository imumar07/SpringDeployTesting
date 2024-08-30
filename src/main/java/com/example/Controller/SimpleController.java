package com.example.Controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SimpleController {
    @RequestMapping("/")
    public String requestMethodName() {
        return "index";
    }
    @RequestMapping("/next")
    public String metod2() {
        return "index2";
    }
    
    

}
