package com.kvscode.springboot.springmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    
    //create controller method for intial form 
    @GetMapping("/showform")
    public String showForm()
    {
        return "helloworld-form";
    }

    //create controller method for process the form 
    @RequestMapping("/processform")
    public String processForm()
    {
        return "helloworld";
    }


    @PostMapping("/processformVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName , Model theModel)
    { 
        //convert to upper case 
        theName=theName.toUpperCase();

        //add the data to the input parameter
        String result="YO My friend from v3!! "+ theName;

        //add/load  data to the model
        theModel.addAttribute("ModeledData", result);
        
        return "helloworld";
    }
    //creating the controller method for read form data and add data to our model

    @RequestMapping("/processformVersionTwo")
    public String letsMakeIt(HttpServletRequest http , Model theModel)
    {
        //get the request parameter from the HTML form
        String theName=http.getParameter("studentName");

        //convert to upper case 
        theName=theName.toUpperCase();

        //add the data to the input parameter
        String result="YO! "+ theName;

        //add/load  data to the model
        theModel.addAttribute("ModeledData", result);
        
        return "helloworld";
    }
}
