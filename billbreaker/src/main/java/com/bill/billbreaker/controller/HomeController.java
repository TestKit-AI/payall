package com.bill.billbreaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/healthcheck")
    public String homeCheck(){
        return "BillBreaker app is up and running";
    }
}
