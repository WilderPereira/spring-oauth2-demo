package com.example.authServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class DefaultController {

    @GetMapping("/user")
    public String user(Model model, Principal principal) {
        model.addAttribute("principal", principal.getName());
        return "/user";
    }
}
