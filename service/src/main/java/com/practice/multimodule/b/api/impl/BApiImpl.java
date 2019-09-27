package com.practice.multimodule.b.api.impl;

import com.practice.multimodule.b.api.BApi;
import com.practice.multimodule.b.service.BService;
import org.springframework.stereotype.Component;

@Component
public class BApiImpl implements BApi {

    private final BService bService;

    public BApiImpl(BService bService) {
        this.bService = bService;
    }

    @Override
    public String hello(String username) {
        return bService.hello(username);
    }
}
