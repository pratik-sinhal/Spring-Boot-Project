package com.pratik.application.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ServiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        return "GET API";
    }
}
