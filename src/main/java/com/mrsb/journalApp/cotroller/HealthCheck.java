package com.mrsb.journalApp.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health")
    public String healthCHeck(){
        return "Application Health id Good !...";
    }
}
