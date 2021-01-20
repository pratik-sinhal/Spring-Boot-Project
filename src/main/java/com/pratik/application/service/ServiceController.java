package com.pratik.application.service;

import org.apache.logging.log4j.spi.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api")
public class ServiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        Logger logger = LoggerFactory.getLogger(ServiceController.class);
        return "GET API";
    }
}

























