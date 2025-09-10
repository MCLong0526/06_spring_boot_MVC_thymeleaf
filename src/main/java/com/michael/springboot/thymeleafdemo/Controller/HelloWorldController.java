package com.michael.springboot.thymeleafdemo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // a new controller method to show initial HTML page
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    // need a controller method to process the HTML form data
    @RequestMapping("/processForm")
    public String processForm(){
        return "submission-confirmation";
    }

    //need a controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read the request paramater from HTML form
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo !" + theName;

        model.addAttribute("theDate", new java.util.Date());

        model.addAttribute("message", result);

        return "helloWorld";

    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();

        String result = "Hey my friends !" + theName;

        model.addAttribute("theDate", new java.util.Date());
        model.addAttribute("message", result);
        return "helloWorld";
    }


}
