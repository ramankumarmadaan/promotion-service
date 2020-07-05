package com.wipro.promotionservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RefreshScope
public class HomeController {

    @GetMapping("isActive")
    public String isActive(){
        return "ACTIVE";
    }
}
