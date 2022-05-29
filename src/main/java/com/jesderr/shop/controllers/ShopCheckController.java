package com.jesderr.shop.controllers;

import com.jesderr.shop.models.CheckInfo;
import com.jesderr.shop.models.ProductCheck;
import com.jesderr.shop.models.ShopCheck;
import com.jesderr.shop.services.ShopCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shopcheck")
public class ShopCheckController {
    private final ShopCheckService shopCheckService;

    public ShopCheckController(ShopCheckService shopCheckService) {
        this.shopCheckService = shopCheckService;
    }

    @PostMapping("create")
    public void createShopCheck(@RequestBody ShopCheck shopCheck){
        this.shopCheckService.createShopCheck(shopCheck);
    }

    @PostMapping("pay")
    public ProductCheck createProductCheck(@RequestBody CheckInfo checkInfo){
        return this.shopCheckService.createProductCheck(checkInfo);
    }
}
