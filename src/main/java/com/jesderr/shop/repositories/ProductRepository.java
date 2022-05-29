package com.jesderr.shop.repositories;

import com.jesderr.shop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByShopId(Long shopId);
}
