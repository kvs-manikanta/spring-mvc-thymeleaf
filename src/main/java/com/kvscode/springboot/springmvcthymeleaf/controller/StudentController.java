package com.kvscode.springboot.springmvcthymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kvscode.springboot.springmvcthymeleaf.model.Student;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;
    
    @Value("${languages}")
    private List<String> languages;

    @Value("${favos}")
    private List<String> favos;

    @GetMapping("/showstudentform")
    public String showForm(Model theModel)
    {
        Student theStudent=new Student();
        //creating the Stuydent object and adding to the model 
        theModel.addAttribute("student",theStudent);

        //add list of countries to the model 
        theModel.addAttribute("countries", countries);

        //add the list of languages to the model
        theModel.addAttribute("languages", languages);

        //add the list of osSystems to the model
        theModel.addAttribute("favos", favos);
        return "student-form";
    }

    @PostMapping("/processstudentform")
    
    public String processStudent(@ModelAttribute("student") Student theStudent)
    {
        System.out.println("The Student is :" + theStudent.getFirstName() + " "+theStudent.getLastName());
        return "process-student-form";
    }
}
