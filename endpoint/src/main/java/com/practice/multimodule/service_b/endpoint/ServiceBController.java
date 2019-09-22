package com.practice.multimodule.service_b.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {


    @RequestMapping("/service_b/hello")
    public String hello(@RequestParam("username") String username) {
        return "hello, " + username;
    }

}
