package com.example.demo;

import com.example.demo.demo1.SaleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    SaleService saleService;
    @Test
    void contextLoads() {
    }
    @Test
    public void test3(){
    double fee=saleService.sale("vip",100);
    System.out.println(fee);
    }

}
