package com.jesderr.shop.services;


import com.jesderr.shop.models.Product;
import com.jesderr.shop.models.Shop;
import com.jesderr.shop.repositories.ProductRepository;
import com.jesderr.shop.repositories.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ShopRepository shopRepository;

    public ProductService(ProductRepository productRepository, ShopRepository shopRepository) {
        this.productRepository = productRepository;
        this.shopRepository = shopRepository;
    }

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        Optional<Product> optionalProduct = this.productRepository.findById(productId);
        return optionalProduct.get();
    }

    public List<Product> getProductsByShopId(Long shopId) {
        return this.productRepository.findByShopId(shopId);
    }
}
