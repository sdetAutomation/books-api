package com.sdet.auto.booksapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {

    @RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String health()  {
        String returnString = "{ \"status\": \"OK\" }";
        return returnString;
    }
}
