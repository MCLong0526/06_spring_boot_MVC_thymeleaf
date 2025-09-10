package com.michael.springboot.thymeleafdemo.Controller;

import com.michael.springboot.thymeleafdemo.model.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkerController {

    @GetMapping("/showWorkerForm")
    public String showForm(Model theModel){
        Worker theWorker = new Worker();
        theModel.addAttribute("worker", theWorker);
        return "worker-form";
    }

    @PostMapping("/processWorkerForm")
    public String processForm(@ModelAttribute("worker") Worker theWorker){
        System.out.println("theWorker :" + theWorker.getFirstName()+theWorker.getLastName()+ " Email :"+theWorker.getEmail());
        return "worker-confirmation";
    }

}
