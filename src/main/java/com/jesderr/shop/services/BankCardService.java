package com.jesderr.shop.services;

import com.jesderr.shop.models.BankCard;
import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.repositories.BankCardRepository;
import com.jesderr.shop.repositories.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankCardService {

    private final BankCardRepository bankCardRepository;
    private final BuyerRepository buyerRepository;

    public BankCardService(BankCardRepository bankCardRepository,BuyerRepository buyerRepository){
        this.bankCardRepository = bankCardRepository;
        this.buyerRepository = buyerRepository;
    }

    public List<BankCard> getAll(){
        return bankCardRepository.findAll();
    }

    public void createBankCard(BankCard bankCard){
        this.bankCardRepository.save(bankCard);
    }

    public BankCard getCardById(Long id){
        Optional<BankCard> bankCardOptional = this.bankCardRepository.findById(id);
        return bankCardOptional.get();
    }

    public BankCard createCardForBuyer(BankCard bankCard, Long buyerId){
        this.bankCardRepository.save(bankCard);
        Optional<Buyer> buyerOptional = this.buyerRepository.findById(buyerId);
        Buyer buyer = buyerOptional.get();
        buyer.bankCardId = bankCard.id;
        this.buyerRepository.save(buyer);
        return bankCard;
    }
}
