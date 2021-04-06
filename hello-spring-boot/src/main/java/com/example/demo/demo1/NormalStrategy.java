package com.example.demo.demo1;

import org.springframework.stereotype.Service;

@Service
public class NormalStrategy implements Calculatestrategy{
    @Override
    public String getType() {
        return "normal";
    }

    @Override
    public double discount(double fee) {
        return fee*1.0;
    }
}
