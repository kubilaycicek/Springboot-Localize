package com.kubilaycicek.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class TestController {
    @Autowired
    MessageSource messageSource;

    @GetMapping("/getMessage")
    public String getMessage(Locale locale) {
        return messageSource.getMessage("hello.message", null, locale);
    }
}
