package com.example.demo.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal") //요청 url
public class Calculator { 
    
    @GetMapping("/view")
    public String calView() {

        return "result";
    }
    @GetMapping("/result")
    public String calResult(
            @RequestParam("op1") int op1,
            @RequestParam("op2") int op2,
            Model model
    ) {

        model.addAttribute("result", op1+op2);

        return "result";
    }

}