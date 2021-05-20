package com.tacoloco;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Calculator {
    @RequestMapping("./")
    public TotalOrder totalCost(@RequestBody TotalInquiry amount){
        double totalCost=0;
        int totalAmount=0;
        for (Map.Entry<String, Integer> itemAndAmount: amount.getOrderPrice().entrySet()){
            String item = itemAndAmount.getKey();
            if (!MenuItems.ITEMS.containsKey(item)){
                    throw new IncorrectChoice();
            }
            int num= itemAndAmount.getValue();
            if(num<0){
                throw new IncorrectAmount();
            }
            totalAmount+=num;
            double itemVal=MenuItems.ITEMS.get(item);
            double excost=num*itemVal;
            totalCost += excost;

        }
        if (totalAmount>=4){
            totalCost*=0.8;
        }
        return new TotalOrder(amount.getOrderItem(), totalCost);
    }
}
