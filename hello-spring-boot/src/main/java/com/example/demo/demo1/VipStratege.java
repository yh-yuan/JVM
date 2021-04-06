package com.example.demo.demo1;

import org.springframework.stereotype.Service;

@Service
public class VipStratege implements  Calculatestrategy {
    @Override
    public String getType() {
        return "vip";
    }

    @Override
    public double discount(double fee) {
        return fee*0.8;
    }
}
