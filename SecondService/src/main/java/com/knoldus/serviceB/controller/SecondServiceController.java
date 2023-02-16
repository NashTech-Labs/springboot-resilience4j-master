package com.knoldus.serviceB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class SecondServiceController {

    @GetMapping
    public String serviceB() {
        return "2nd Service is called from FirstService ";
    }

}
