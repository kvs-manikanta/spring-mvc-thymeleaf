package com.kvscode.springboot.springmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    
    @GetMapping("/hello")
    public String sayhello(Model theModel)
    {
        theModel.addAttribute("theDate",new java.util.Date());

        return "helloworld";
    }
}
