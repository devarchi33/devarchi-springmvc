package com.devarchi.web.controller;

import com.devarchi.web.command.MemberJoinRequest;
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

    @RequestMapping(value = "/member")
    public String member(Model model,
                         MemberJoinRequest request) {
        System.out.println("Email: " + request.getEmail());
        System.out.println("Name: " + request.getName());
        System.out.println("Pass: " + request.getPass());
        System.out.println("Confirm Pass: " + request.getConfirmPass());

        model.addAttribute("member", "회원가입!");
        return "member";
    }
}
