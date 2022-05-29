package com.jesderr.shop.services;

import com.jesderr.shop.models.Shop;
import com.jesderr.shop.repositories.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> getAllShops(){
        return this.shopRepository.findAll();
    }

    public Shop getShopById(Long shopId){
        Optional<Shop> optionalShop = this.shopRepository.findById(shopId);
        return optionalShop.get();
    }
}
