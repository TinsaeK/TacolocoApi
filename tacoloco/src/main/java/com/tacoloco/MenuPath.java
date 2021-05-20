package com.tacoloco;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuPath {
    @RequestMapping("./")
    public ItemChoice item(){
        return new ItemChoice(MenuItems.ITEMS);
    }
}
