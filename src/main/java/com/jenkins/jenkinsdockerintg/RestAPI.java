package com.jenkins.jenkinsdockerintg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    @GetMapping("/jenkins")
    public static String getString()
    {
        return "Hello from jenkins";
    }

}
