package com.practice.multimodule.b.endpoint;

import com.practice.multimodule.b.api.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    @Autowired
    private BService BService;

    @RequestMapping("/service_b/hello")
    public String hello(@RequestParam("username") String username) {
        return BService.hello(username);
    }

}
