package com.example.demo.demo1;

import org.springframework.stereotype.Service;

@Service
public interface Calculatestrategy {
    public String getType();

    public double discount(double fee);
}
