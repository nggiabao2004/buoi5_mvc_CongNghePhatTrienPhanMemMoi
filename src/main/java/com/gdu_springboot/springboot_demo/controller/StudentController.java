package com.gdu_springboot.springboot_demo.controller;

import com.gdu_springboot.springboot_demo.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/student-form")
    public String studentForm(@ModelAttribute("student") Student student) {
        student = new Student();
        return "student-form";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student-form";
        } else {
            return "process-student-form";
        }
    }
}
