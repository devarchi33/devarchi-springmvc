package com.devarchi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by donghoon on 2016. 2. 14..
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("greeting", "안녕하세요!");
        return "hello";
    }
}
