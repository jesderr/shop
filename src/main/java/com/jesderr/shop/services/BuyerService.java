package com.jesderr.shop.services;

import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.repositories.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyerService {
    private final BuyerRepository buyerRepository;

    public BuyerService(BuyerRepository buyerRepository){
        this.buyerRepository = buyerRepository;
    }
    public List<Buyer> getAll(){
        return this.buyerRepository.findAll();
    }
    public void createBuyer(Buyer buyer){
        this.buyerRepository.save(buyer);
    }

    public Buyer getBuyerById(Long buyerid){
        Optional<Buyer> buyerOptional = this.buyerRepository.findById(buyerid);
        return buyerOptional.get();
    }
}
