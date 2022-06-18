package com.jesderr.shop.services;

import com.jesderr.shop.models.CheckInfo;
import com.jesderr.shop.models.Product;
import com.jesderr.shop.models.ProductCheck;
import com.jesderr.shop.models.ShopCheck;
import com.jesderr.shop.repositories.ProductCheckRepository;
import com.jesderr.shop.repositories.ProductRepository;
import com.jesderr.shop.repositories.ShopCheckRepository;
import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

@Service
public class ShopCheckService {

    private final ProductCheckRepository productCheckRepository;
    private final ShopCheckRepository shopCheckRepository;

    private final ProductRepository productRepository;

    public ShopCheckService(ProductCheckRepository productCheckRepository, ShopCheckRepository shopCheckRepository, ProductRepository productRepository) {
        this.productCheckRepository = productCheckRepository;
        this.shopCheckRepository = shopCheckRepository;
        this.productRepository = productRepository;
    }

    public void createShopCheck(ShopCheck shopCheck) {
        this.shopCheckRepository.save(shopCheck);
    }

    public ShopCheck getShopCheckById(Long id){
        return this.shopCheckRepository.findById(id).get();
    }

    public ProductCheck createProductCheck(CheckInfo checkInfo) {
        String time = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
        String date = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        ShopCheck shopCheck = new ShopCheck("cash", time, date, checkInfo.buyerId);
        this.shopCheckRepository.save(shopCheck);
        ProductCheck productCheck = new ProductCheck(checkInfo.productId, shopCheck.id);
        this.productCheckRepository.save(productCheck);
        return productCheck;
    }
}
