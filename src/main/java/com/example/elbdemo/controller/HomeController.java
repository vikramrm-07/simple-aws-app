package com.example.elbdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() throws Exception {
        String hostname = InetAddress.getLocalHost().getHostName();
        return "Application is running on instance: " + hostname;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
