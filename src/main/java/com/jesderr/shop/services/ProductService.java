package com.jesderr.shop.services;


import com.jesderr.shop.models.Product;
import com.jesderr.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Product> optionalProduct = this.productRepository.findById(productId);
        return optionalProduct.get();
    }
}
