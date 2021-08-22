package com.projects.faceassistant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contacts {

    @GetMapping("/contacts")
    public String getContacts() {
        return "Hello world";
    }
}