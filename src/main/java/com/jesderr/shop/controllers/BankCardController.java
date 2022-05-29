package com.jesderr.shop.controllers;

import com.jesderr.shop.models.BankCard;
import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.services.BankCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bankcard")
public class BankCardController {

    private final BankCardService bankCardService;

    public BankCardController(BankCardService bankCardService) {
        this.bankCardService = bankCardService;
    }

    @GetMapping("all")
    public List<BankCard> getAll() {
        return bankCardService.getAll();
    }

    @PostMapping("create")
    public void createBankCard(@RequestBody BankCard bankCard) {
        this.bankCardService.createBankCard(bankCard);
    }

    @PostMapping("createBankCard/{buyerId}")
    public BankCard createBankCardForBuyer(@RequestBody BankCard bankCard, @PathVariable Long buyerId) {
        return this.bankCardService.createCardForBuyer(bankCard, buyerId);
    }

    @GetMapping("{id}")
    public BankCard getCardById(@PathVariable Long id) {
        return this.bankCardService.getCardById(id);
    }

}


