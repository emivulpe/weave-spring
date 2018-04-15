package com.project.weave.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppContoller {

    @RequestMapping("/home")
    public String showHomePage(){
        return "Home";
    }
}
