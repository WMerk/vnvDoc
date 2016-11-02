package com.vnv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Waldemar on 02.11.2016.
 */
@Controller
public class HomeController {

    @RequestMapping (value = "/")
    public String home(){
        return "home";
    }
}
