package com.practice.multimodule.b.impl;

import com.practice.multimodule.b.api.BService;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {
    @Override
    public String hello(String username) {
        return "hello, " + username;
    }
}
