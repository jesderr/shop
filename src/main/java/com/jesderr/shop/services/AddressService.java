package com.jesderr.shop.services;

import com.jesderr.shop.models.Address;
import com.jesderr.shop.repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public long createAddress(Address address){
        return this.addressRepository.save(address).id;
    }
}
