package com.tacoloco;

public class TotalOrder {
    private final String orderItem;
    private final double totalCost;
    public TotalOrder(String orderItem, double totalCost){
        this.orderItem=orderItem;
        this.totalCost=totalCost;
    }

    public String getOrderItem(){
        return orderItem;
    }

    public double getTotalCost(){
        return totalCost;
    }
}
