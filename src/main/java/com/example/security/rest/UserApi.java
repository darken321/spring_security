package com.example.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserApi {
    @GetMapping("admin")
    public String admin() {
        return "Hello admin";
    }

    @GetMapping("user")
    public String user() {
        return "Hello user";
    }

    @GetMapping("guest")
    public String guest() {
        return "Hello guest";
    }
}
