package com.jesderr.shop.services;

import com.jesderr.shop.models.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GeneratorService {

    private final BankCardService bankCardService;
    private final BuyerService buyerService;
    private final AddressService addressService;
    private final ShopService shopService;
    private final ProductService productService;


    public GeneratorService(BankCardService bankCardService,
                            BuyerService buyerService,
                            AddressService addressService,
                            ShopService shopService,
                            ProductService productService) {
        this.bankCardService = bankCardService;
        this.buyerService = buyerService;
        this.addressService = addressService;
        this.shopService = shopService;
        this.productService = productService;
    }

    private static final List<String> STREETS = List.of("Kosmonavtov", "Lenina", "Pushkina", "Butlerova", "Ivanova",
            "Muxina", "Dzerjinskogo", "Inernazional", "Gogolya", "Stroiteley");
    private static final List<String> CITIES = List.of("Ukhta", "Moscow", "Petersburg", "Omsk", "Tomsk", "Kirovsk",
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
    private static final List<String> DIGITCARDS = List.of("4276280031233469", "4276280098991123", "4276280010230012",
            "4276280030213411", "4276280055429921", "4276280033110021", "4276280032113410", "4276280000100391",
            "4276280011119000", "4276280099410131");

    @Transactional
    public void fillDataBase(int n) {
        List<BankCard> bankCards = this.generateBankCards(n);
        for (BankCard bankCard : bankCards) {
            this.bankCardService.createBankCard(bankCard);
        }

        List<Buyer> buyers = this.generateBuyers(n, bankCards);
        for (Buyer buyer : buyers) {
            this.buyerService.createBuyer(buyer);
        }

        List<Address> addresses = this.generateAddresses(n);
        for (Address address : addresses) {
            address.id = this.addressService.createAddress(address);
        }

        List<Shop> shops = this.generateShop(n, addresses);
        for (Shop shop : shops) {
            shop.id = this.shopService.createShop(shop);
        }

        List<Product> products = this.generateProducts(n, shops);
        for (Product product : products) {
            this.productService.createProduct(product);
        }
    }

    private List<Buyer> generateBuyers(int n, List<BankCard> bankCardsList) {
        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Buyer buyer = new Buyer();

            buyer.id = (long) i;
            BankCard bankCard = bankCardsList.get(i);
            buyer.bankCardId = bankCard.id;
            switch (bankCard.cardHolder) {
                case "A.M.Petrova": {
                    buyer.gender = "female";
                    buyer.name = "Anastasia";
                    buyer.surname = "Petrova";
                    break;
                }
                case "B.A.Ivanov": {
                    buyer.gender = "male";
                    buyer.name = "Boris";
                    buyer.surname = "Ivanov";
                    break;
                }
                case "M.M.Sidorov": {
                    buyer.gender = "male";
                    buyer.name = "Mikhail";
                    buyer.surname = "Sidorov";
                    break;
                }

                case "S.S.Pushkin": {
                    buyer.gender = "male";
                    buyer.name = "Sergey";
                    buyer.surname = "Pushkin";
                    break;
                }
                case "P.P.Ulyanova": {
                    buyer.gender = "female";
                    buyer.name = "Pavel";
                    buyer.surname = "Ulyanova";
                    break;
                }
                case "S.P.Orlova": {
                    buyer.gender = "female";
                    buyer.name = "Sasha";
                    buyer.surname = "Orlova";
                    break;
                }
                case "A.M.Kushkin": {
                    buyer.gender = "male";
                    buyer.name = "Anfisa";
                    buyer.surname = "Kushkin";
                    break;
                }
                case "A.M.Vladimirova": {
                    buyer.gender = "female";
                    buyer.name = "Anastasia";
                    buyer.surname = "Vladimirova";
                    break;
                }
                case "S.A.Petrov": {
                    buyer.gender = "male";
                    buyer.name = "Saveliy";
                    buyer.surname = "Petrov";
                    break;
                }
                case "E.A.Bystrov": {
                    buyer.gender = "male";
                    buyer.name = "Egor";
                    buyer.surname = "Bystrov";
                    break;
                }
                default:
                    buyer.name = "Mistake";
                    break;
            }
            buyers.add(buyer);
        }
        return buyers;
    }

    private List<BankCard> generateBankCards(int n) {
        List<BankCard> bankCards = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            BankCard bankCard = new BankCard();
            SecureRandom rand = new SecureRandom();
            bankCard.id = (long) i;
            bankCard.cvv = rand.nextInt(999 - 100);
            bankCard.actionTime = ACTION_TIME_FOR_BC.get(i);
            bankCard.cardHolder = CARDHOLDER_BC.get(i);
            bankCard.digitCard = Long.parseLong(DIGITCARDS.get(i));
            bankCards.add(bankCard);
        }
        return bankCards;
    }

    private List<Product> generateProducts(int n, List<Shop> shopList) {
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Product product = new Product();

            Random rand = new Random();

            product.id = (long) i;

            product.shopId = shopList.get(i).id;

            product.date = DATE_PRODUCTS.get(i);

            Shop curShop = shopList.get(i);

            switch (curShop.productType) {
                case "Technic":
                    product.name = TECHNIC_PRODUCTS.get(rand.nextInt(TECHNIC_PRODUCTS.size()));
                    break;
                case "Shoes":
                    product.name = SHOES_PRODUCTS.get(rand.nextInt(SHOES_PRODUCTS.size()));
                    break;
                case "Clothes":
                    product.name = CLOTHES_PRODUCTS.get(rand.nextInt(COMPUTERS_PRODUCTS.size()));
                    break;
                case "Chemicals":
                    product.name = CHEMICALS_PRODUCTS.get(rand.nextInt(CHEMICALS_PRODUCTS.size()));
                    break;
                case "Electricity":
                    product.name = ELECTRICITY_PRODUCTS.get(rand.nextInt(ELECTRICITY_PRODUCTS.size()));
                    break;
                case "Dishes":
                    product.name = DISHES_PRODUCTS.get(rand.nextInt(DISHES_PRODUCTS.size()));
                    break;
                case "Pens":
                    product.name = PENS_PRODUCTS.get(rand.nextInt(PENS_PRODUCTS.size()));
                    break;
                case "Cars":
                    product.name = CARS_PRODUCTS.get(rand.nextInt(CARS_PRODUCTS.size()));
                    break;
                case "Toys":
                    product.name = TOYS_PRODUCTS.get(rand.nextInt(TOYS_PRODUCTS.size()));
                    break;
                case "Computers":
                    product.name = COMPUTERS_PRODUCTS.get(rand.nextInt(COMPUTERS_PRODUCTS.size()));
                    break;
                default:
                    product.name = "Mistake";
                    break;
            }

            product.cost = rand.nextInt(10000);

            product.weight = rand.nextInt(50);

            products.add(product);

        }
        return products;
    }

    private List<Shop> generateShop(int n, List<Address> address) {
        List<Shop> shops = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Shop shop = new Shop();

            shop.id = (long) i;
            shop.name = NAME_OF_SHOPS.get(i);
            shop.productType = PRODUCT_TYPE.get(i);
            shop.addressId = address.get(i).id;
            shops.add(shop);
        }
        return shops;
    }

    private List<Address> generateAddresses(int n) {
        List<Address> addresses = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            Address address = new Address();

            Random rand = new Random();
            address.id = (long) i;
            address.houseNumber = rand.nextInt(200);
            address.street = STREETS.get(i);
            address.city = CITIES.get(i);
            addresses.add(address);
        }
        return addresses;
    }
}
