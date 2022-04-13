package com.company1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();
        List<Address> addressList = generator.generateAddresses(5);
        for (Address address : addressList){
            System.out.println(address);
        }
        System.out.println("--------------------");
        List<Shop> shopList = generator.generateShop(6, 5);
        for (Shop shop: shopList) {
            System.out.println(shop);
        }
        System.out.println("--------------------");
        List<Product> productList = generator.generateProducts(6,shopList);
        for (Product product: productList) {
            System.out.println(product);
        }
        System.out.println("--------------------");
        List<BankCard> bankCardList = generator.generateBankCards(6);
        for (BankCard bankCard: bankCardList) {
            System.out.println(bankCard);
        }
        System.out.println("--------------------");
        List<Buyer> buyerList = generator.generateBuyers(6,bankCardList);
        for (Buyer buyer: buyerList) {
            System.out.println(buyer);
        }
        System.out.println("--------------------");
        List<ShopCheck> shopCheckList = generator.generateShopChecks(6);
        for (ShopCheck shopCheck: shopCheckList) {
            System.out.println(shopCheck);
        }
        System.out.println("--------------------");
        List<ProductCheck> productCheckList = generator.generateProductChecks(6);
        for (ProductCheck productCheck: productCheckList) {
            System.out.println(productCheck);
        }
    }
}
