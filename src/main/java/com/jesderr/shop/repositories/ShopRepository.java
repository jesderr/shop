package com.jesderr.shop.repositories;

import com.jesderr.shop.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Long> {
}
