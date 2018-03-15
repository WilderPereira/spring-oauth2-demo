package com.wilderpereira.oauth2example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/")
    public Principal user(Principal principal) {
        return principal;
    }
}

