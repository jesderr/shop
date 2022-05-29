package com.jesderr.shop.controllers;
import com.jesderr.shop.models.Buyer;
import com.jesderr.shop.models.Product;
import com.jesderr.shop.models.Shop;
import com.jesderr.shop.repositories.ProductRepository;
import com.jesderr.shop.services.BuyerService;
import com.jesderr.shop.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("getProducts")
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @GetMapping("getProduct/{id}")
    public Product getProductById(@PathVariable Long id){
        return this.productService.getProductById(id);
    }
}
