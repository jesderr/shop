package com.jesderr.shop.services;


import com.jesderr.shop.models.Product;
import com.jesderr.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public Product getProductById(Long productId){
        return this.productRepository.findById(productId);
    }
}
