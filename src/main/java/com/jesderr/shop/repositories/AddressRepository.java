package com.jesderr.shop.repositories;

import com.jesderr.shop.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
