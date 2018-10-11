package cn.itcast.microservice.controller;

import cn.itcast.microservice.pojo.Item;
import cn.itcast.microservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/item/{id}")
    public Item queryItemById(@PathVariable(name = "id") Long id){
        return itemService.queryItemById(id);
    }

}
