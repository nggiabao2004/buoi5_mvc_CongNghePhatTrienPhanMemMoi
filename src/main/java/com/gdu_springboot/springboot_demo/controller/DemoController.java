package com.gdu_springboot.springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class DemoController {
    @GetMapping("/xin-chao")
    public String xinChao(Model model) {
        model.addAttribute("message","Tôi là sinh viên");
        model.addAttribute("time", LocalTime.now());
        return "xin-chao";
    }
}
