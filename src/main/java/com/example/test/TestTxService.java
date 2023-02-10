package com.example.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestTxService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test() {
        System.out.println("TestTxService.test");
    }
}
