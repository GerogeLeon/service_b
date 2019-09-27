package com.practice.multimodule.b.service.impl;

import com.practice.multimodule.b.service.BService;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {
    @Override
    public String hello(String username) {
        return "hello, " + username;
    }
}
