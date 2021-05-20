package com.tacoloco;

import java.util.HashMap;

public class ItemChoice {
    private final HashMap<String, Double> item;
    public ItemChoice(HashMap<String, Double> item){
        this.item=item;
    }
    public HashMap<String, Double> getItem() {
        return item;
    }
}
