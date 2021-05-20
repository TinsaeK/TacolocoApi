package com.tacoloco;

import java.util.HashMap;

public class TotalInquiry {
    private final String orderItem;
    private final HashMap<String, Integer> orderPrice;

    public TotalInquiry(String orderItem, HashMap<String,Integer> orderPrice){
        this.orderItem=orderItem;
        this.orderPrice=orderPrice;
    }

    public String getOrderItem(){
        return orderItem;
    }

    public HashMap<String, Integer> getOrderPrice() {
        return orderPrice;
    }
}
