package com.practice.multimodule.service_b.service.impl;

import com.practice.multimodule.service_b.service.ServiceBService;
import org.springframework.stereotype.Service;

@Service
public class ServiceBServiceImpl implements ServiceBService {
    @Override
    public String hello(String username) {
        return "hello, " + username;
    }
}
