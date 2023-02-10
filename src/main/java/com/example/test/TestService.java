package com.example.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
    private final TestTxService txService;

    public TestService(TestTxService txService) {
        this.txService = txService;
    }

    @Transactional
    public void test() {
        try {
            Thread.sleep(1000);
            System.out.println("TestService.test");
            txService.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
