package com.example.demo.demo1;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SaleService {

    private Map<String,Calculatestrategy> map= new HashMap<>();

    public SaleService(List<Calculatestrategy> calculateStrategyList){
        for(Calculatestrategy stategy:calculateStrategyList){
            map.put(stategy.getType(),stategy);
        }
    }
    public double sale(String userType,double fee){
        Calculatestrategy calculatestrategy=map.get(userType);
        fee=calculatestrategy.discount(fee);
        return fee;
    }

}
