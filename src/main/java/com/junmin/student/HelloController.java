package com.junmin.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/java")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        
        
        
        model.addAttribute("user", name);
        return "hello";
    }
    
    
}