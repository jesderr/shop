package com.company1;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private static final List<String> STREETS = List.of("Kosmonavtov", "Lenina", "Pushkina", "Butlerova", "Ivanova",
            "Muxina", "Dzerjinskogo", "Inernazionalnia", "Gogolya", "Stroiteley");
    private static final List<String> CITIES = List.of("Ukhta", "Moscow", "Saint-Petersburg", "Omsk", "Tomsk", "Kirovsk",
            "Kirov", "Kaluga", "Syktyvkar", "Obninsk");

    private static final List<String> NAME_OF_SHOPS = List.of("Perekrestok", "Magnit", "VITA", "Pyatochok", "Ivanov",
            "Muxa", "Ribalov", "Diadia Vanya", "Kotofey", "Avangard");
    private static final List<String> PRODUCT_TYPE = List.of("Technic", "Shoes", "Clothes", "Chemicals", "Electricity",
            "Dishes", "Pens", "Cars", "Toys", "Computers");

    private static final List<String> TECHNIC_PRODUCTS = List.of("Telephone", "TV", "Laptop");
    private static final List<String> SHOES_PRODUCTS = List.of("Nike", "Adidas", "Puma");
    private static final List<String> CLOTHES_PRODUCTS = List.of("Shirt", "Shorts", "Socks");
    private static final List<String> CHEMICALS_PRODUCTS = List.of("Uran", "Sodium-chloride", "Fairy");
    private static final List<String> ELECTRICITY_PRODUCTS = List.of("Guide", "Lamp", "Electric kettle");
    private static final List<String> DISHES_PRODUCTS = List.of("Forks", "Mugs", "Plates");
    private static final List<String> PENS_PRODUCTS = List.of("Gel", "Ballpoint", "Pencils");
    private static final List<String> CARS_PRODUCTS = List.of("VAS", "Volvo", "Mazda");
    private static final List<String> TOYS_PRODUCTS = List.of("Clown", "Bear", "Hare");
    private static final List<String> COMPUTERS_PRODUCTS = List.of("Computer-11022", "Computer-011", "Computer-301");

    private static final List<String> DATE_PRODUCTS = List.of("04.05.2001", "04.12.2005", "14.11.2011", "31.12.2017",
            "04.08.2002", "09.09.2009", "04.04.2004", "11.11.2011", "04.05.2001", "14.11.2021");

    private static final List<String> ACTION_TIME_FOR_BC = List.of("11.06.2001", "12.04.2002", "14.12.2004", "01.12.2007",
            "14.08.2002", "19.09.2009", "04.04.2020", "11.11.2021", "01.01.2001", "21.11.2001");
    private static final List<String> CARDHOLDER_BC = List.of("A.M.Petrova", "B.A.Ivanov", "M.M.Sidorov", "S.S.Pushkin",
            "P.P.Ulyanova", "S.P.Orlova", "A.M.Kushkin", "A.M.Vladimirova", "S.A.Petrov", "E.A.Bystrov");
    private static final List<String> DIGITCARDS = List.of("4276-2800-3123-3469", "4276-2800-9899-1123", "4276-2800-1023-0012",
            "4276-2800-3021-3411", "4276-2800-5542-9921", "4276-2800-3311-0021", "4276-2800-3211-3410", "4276-2800-0010-0391",
            "4276-2800-1111-9000", "4276-2800-9941-0131");

    private static final List<String> OPERATION_TYPE = List.of("non-cash", "cash");
    private static final List<String> DATE_OF_OPERATION = List.of("11.06.2022", "21.05.2022", "14.12.2021", "01.12.2022",
            "14.08.2020", "19.09.2020", "04.04.2022", "11.01.2021", "12.12.2021", "01.11.2022");
    private static final List<String> TIME_OF_OPERATION = List.of("11:06:00", "12:04:20", "14:12:20", "10:12:00",
            "14:08:22", "19:09:09", "04:04:40", "11:11:21", "01:01:01", "21:11:01");


    public List<ProductCheck> generateProductChecks(int n){
        List<ProductCheck> productChecks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ProductCheck productCheck = new ProductCheck();

            SecureRandom rand = new SecureRandom();
            productCheck.id = (long) i + 1;
            productCheck.productId = rand.nextInt(n) + 1 ;
            productCheck.shopCheckId = rand.nextInt(n) + 1;

            productChecks.add(productCheck);
        }
        return productChecks;
    }

    public List<ShopCheck> generateShopChecks(int n) {
        List<ShopCheck> shopChecks = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            ShopCheck shopCheck = new ShopCheck();

            SecureRandom rand = new SecureRandom();
            shopCheck.id = (long) i + 1;

            shopCheck.operationType = OPERATION_TYPE.get(rand.nextInt(OPERATION_TYPE.size()));
            shopCheck.date = DATE_OF_OPERATION.get(rand.nextInt(DATE_OF_OPERATION.size()));
            shopCheck.time = TIME_OF_OPERATION.get(rand.nextInt(TIME_OF_OPERATION.size()));
            shopCheck.buyerId = rand.nextInt(n) + 1;


            shopChecks.add(shopCheck);
        }
        return shopChecks;
    }

    public List<Buyer> generateBuyers(int n, List<BankCard> bankCardsList) {
        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Buyer buyer = new Buyer();

            SecureRandom rand = new SecureRandom();
            buyer.id = (long) i + 1;
            buyer.bankCardId = rand.nextInt(n) + 1;
            BankCard curBuyerBankCard = bankCardsList.get(buyer.bankCardId - 1);
            switch (curBuyerBankCard.cardHolder) {
                case "A.M.Petrova" -> {
                    buyer.gender = "female";
                    buyer.name ="Anastasia";
                    buyer.surname = "Petrova";
                }
                case "B.A.Ivanov" -> {
                    buyer.gender = "male";
                    buyer.name ="Boris";
                    buyer.surname = "Ivanov";
                }
                case "M.M.Sidorov" -> {
                    buyer.gender = "male";
                    buyer.name ="Mikhail";
                    buyer.surname = "Sidorov";
                }

                case "S.S.Pushkin" -> {
                    buyer.gender = "male";
                    buyer.name ="Sergey";
                    buyer.surname = "Pushkin";
                }
                case "P.P.Ulyanova" -> {
                    buyer.gender = "female";
                    buyer.name ="Pavel";
                    buyer.surname = "Ulyanova";
                }
                case "S.P.Orlova" -> {
                    buyer.gender = "female";
                    buyer.name ="Sasha";
                    buyer.surname = "Orlova";
                }
                case "A.M.Kushkin" -> {
                    buyer.gender = "male";
                    buyer.name ="Anfisa";
                    buyer.surname = "Kushkin";
                }
                case "A.M.Vladimirova" -> {
                    buyer.gender = "female";
                    buyer.name ="Anastasia";
                    buyer.surname = "Vladimirova";
                }
                case "S.A.Petrov" -> {
                    buyer.gender = "male";
                    buyer.name ="Saveliy";
                    buyer.surname = "Petrov";
                }
                case "E.A.Bystrov" -> {
                    buyer.gender = "male";
                    buyer.name ="Egor";
                    buyer.surname = "Bystrov";
                }
                default -> buyer.name = "Mistake";
            }
            buyers.add(buyer);
        }
        return buyers;
    }

    //BANK_CARDS - DATE + CVV
    public List<BankCard> generateBankCards(int n) {
        List<BankCard> bankCards = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            BankCard bankCard = new BankCard();
            SecureRandom rand = new SecureRandom();
            bankCard.id = (long) i + 1;
            //bankCard.cvv = rand.nextInt(1000);
            bankCard.actionTime = ACTION_TIME_FOR_BC.get(rand.nextInt(ACTION_TIME_FOR_BC.size()));
            bankCard.cardHolder = CARDHOLDER_BC.get(rand.nextInt(CARS_PRODUCTS.size()));
            bankCard.digitCard = DIGITCARDS.get(rand.nextInt(DIGITCARDS.size()));
            bankCards.add(bankCard);
        }
        return bankCards;
    }

    public List<Product> generateProducts(int n, List<Shop> shopList) {
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Product product = new Product();

            Random rand = new Random();

            product.id = (long) i + 1;

            product.shopId = rand.nextInt(n) + 1;

            product.date = DATE_PRODUCTS.get(rand.nextInt(DATE_PRODUCTS.size()));

            Shop curShop = shopList.get(product.shopId - 1);

            switch (curShop.productType) {
                case "Technic" -> product.name = TECHNIC_PRODUCTS.get(rand.nextInt(TECHNIC_PRODUCTS.size()));
                case "Shoes" -> product.name = SHOES_PRODUCTS.get(rand.nextInt(SHOES_PRODUCTS.size()));
                case "Clothes" -> product.name = CLOTHES_PRODUCTS.get(rand.nextInt(COMPUTERS_PRODUCTS.size()));
                case "Chemicals" -> product.name = CHEMICALS_PRODUCTS.get(rand.nextInt(CHEMICALS_PRODUCTS.size()));
                case "Electricity" -> product.name = ELECTRICITY_PRODUCTS.get(rand.nextInt(ELECTRICITY_PRODUCTS.size()));
                case "Dishes" -> product.name = DISHES_PRODUCTS.get(rand.nextInt(DISHES_PRODUCTS.size()));
                case "Pens" -> product.name = PENS_PRODUCTS.get(rand.nextInt(PENS_PRODUCTS.size()));
                case "Cars" -> product.name = CARS_PRODUCTS.get(rand.nextInt(CARS_PRODUCTS.size()));
                case "Toys" -> product.name = TOYS_PRODUCTS.get(rand.nextInt(TOYS_PRODUCTS.size()));
                case "Computers" -> product.name = COMPUTERS_PRODUCTS.get(rand.nextInt(COMPUTERS_PRODUCTS.size()));
                default -> product.name = "Mistake";
            }

            product.cost = rand.nextInt(10000);

            product.weight = rand.nextInt(50);

            products.add(product);

        }
        return products;
    }

    public List<Shop> generateShop(int n, int addressAmount) {
        List<Shop> shops = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Shop shop = new Shop();

            SecureRandom rand = new SecureRandom();
            shop.id = (long) i + 1;
            shop.name = NAME_OF_SHOPS.get(rand.nextInt(NAME_OF_SHOPS.size()));
            shop.productType = PRODUCT_TYPE.get(rand.nextInt(PRODUCT_TYPE.size()));
            shop.addressId = rand.nextInt(addressAmount) + 1;
            shops.add(shop);
        }
        return shops;
    }

    public List<Address> generateAddresses(int n) {
        List<Address> addresses = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Address address = new Address();

            Random rand = new Random();
            address.id = (long) i + 1;
            address.houseNumber = rand.nextInt(200);
            address.street = STREETS.get(rand.nextInt(STREETS.size()));
            address.city = CITIES.get(rand.nextInt(CITIES.size()));
            addresses.add(address);
        }
        return addresses;
    }
}
