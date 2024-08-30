package com.example.Controller;

import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
