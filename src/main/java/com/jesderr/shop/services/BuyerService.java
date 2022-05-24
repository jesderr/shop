package com.jesderr.shop.services;

import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.repositories.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
