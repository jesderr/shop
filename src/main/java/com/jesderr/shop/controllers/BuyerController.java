package com.jesderr.shop.controllers;

import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.services.BuyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("buyer")
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService){
        this.buyerService = buyerService;
    }

    @GetMapping("all")
    public List<Buyer> getAll(){
        return this.buyerService.getAll();
    }

    @PostMapping("create")
    public Long createBuyer(@RequestBody Buyer buyer){
        return this.buyerService.createBuyer(buyer);
    }

    @GetMapping("{buyerid}")
    public Buyer getBuyerById(@PathVariable Long buyerid){
        return this.buyerService.getBuyerById(buyerid);
    }

}
