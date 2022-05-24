package com.jesderr.shop.services;

import com.jesderr.shop.models.BankCard;
import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.repositories.BankCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankCardService {

    private final BankCardRepository bankCardRepository;

    public BankCardService(BankCardRepository bankCardRepository){
        this.bankCardRepository = bankCardRepository;
    }

    public List<BankCard> getAll(){
        return bankCardRepository.findAll();
    }

    public void createBankCard(BankCard bankCard){
        this.bankCardRepository.save(bankCard);
    }

}
