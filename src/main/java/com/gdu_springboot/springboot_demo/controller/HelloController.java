package com.gdu_springboot.springboot_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-form")
    public String helloForm(Model model) {
        return "hello-form";
    }

    @GetMapping("/process-hello-form")
    public String processHelloForm(HttpServletRequest request, Model model) {
        String theName = request.getParameter("theName");
        model.addAttribute("theName", theName);
        theName = theName.toUpperCase();

        return "process-hello-form";
    }
}
