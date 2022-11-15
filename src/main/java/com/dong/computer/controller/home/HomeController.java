package com.dong.computer.controller.home;

import com.dong.computer.entity.Goods;
import com.dong.computer.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/home")
public class HomeController {
    @Autowired
    GoodsService goodsService ;

    @RequestMapping("/query/{id}")
    public Goods getGoodsInfoById(){
        return goodsService.getById(1) ;

    }
}
