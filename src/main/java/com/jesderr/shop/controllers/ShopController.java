package com.jesderr.shop.controllers;

import com.jesderr.shop.models.Shop;
import com.jesderr.shop.services.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("shop")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("all")
    public List<Shop> getAllShops(){
        return this.shopService.getAllShops();
    }

    @GetMapping("{id}")
    public Shop getShopById(@PathVariable Long id){
        return this.shopService.getShopById(id);
    }
}
