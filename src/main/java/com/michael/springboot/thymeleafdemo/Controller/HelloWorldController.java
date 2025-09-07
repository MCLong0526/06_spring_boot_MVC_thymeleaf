package com.michael.springboot.thymeleafdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // a new controller method to show initial HTML page
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    // need a controller method to process the HTML form data
    @RequestMapping("/processForm")
    public String processForm(){
        return "submission-confirmation";
    }

}
