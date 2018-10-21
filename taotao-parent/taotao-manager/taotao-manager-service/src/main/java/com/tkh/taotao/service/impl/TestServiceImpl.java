package com.tkh.taotao.service.impl;

import com.tkh.taotao.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String queryNow() {
        return new Date().toString();
    }
}
