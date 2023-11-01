package com.example.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductApi {
    @GetMapping
    public String getProduct(){
        return "getProduct";
    }

    @PostMapping
    public String saveProduct(){
        return "saveProduct";
    }
}
