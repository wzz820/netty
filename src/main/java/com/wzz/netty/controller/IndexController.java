package com.wzz.netty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * @author wzz
 * @description
 * @create 2019/7/5 15:22
 **/
@Controller
public class IndexController {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("socket");
        mav.addObject("uid", new Random().nextInt(10000));
        return mav;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
