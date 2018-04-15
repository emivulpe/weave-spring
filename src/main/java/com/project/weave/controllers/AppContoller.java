package com.project.weave.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class AppContoller {

    @RequestMapping("/examples")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "Hi");
        return mav;
    }

    @RequestMapping("/")
    public ModelAndView showHomePage(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
