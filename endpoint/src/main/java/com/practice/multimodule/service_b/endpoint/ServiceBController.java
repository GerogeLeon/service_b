package com.practice.multimodule.service_b.endpoint;

import com.practice.multimodule.service_b.service.ServiceBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Autowired
    private ServiceBService serviceBService;

    @RequestMapping("/service_b/hello")
    public String hello(@RequestParam("username") String username) {
        return serviceBService.hello(username);
    }

}
