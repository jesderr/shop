const baseUrl = 'http://localhost:8080/api/';
const buyerPrefix = baseUrl + 'buyer/';
const bankCardPrefix = baseUrl + 'bankcard/';
const productPrefix = baseUrl + 'product/';
const shopPrefix = baseUrl + 'shop/';
const shopCheckPrefix = baseUrl + 'shopcheck/';

export function createEnv() {
  return {
    getAllBankCard : bankCardPrefix + 'all',
    getBankCardById : bankCardPrefix + ':bankCardId',
    createBankCardBy : bankCardPrefix + 'createBankCard/:bankCardId',

    getAllProduct : productPrefix + 'all',
    getAllProductsByShopId : productPrefix + 'shop/:shopId',
    getProductById : productPrefix + ':shopId',

    getAllShops : shopPrefix + 'all',
    getShopById : shopPrefix + ':shopId',

    getBuyerById : buyerPrefix + ':buyerId',
    getAllBuyers : buyerPrefix + 'all',
    createBuyer : buyerPrefix + 'create',

    createProductCheck : shopCheckPrefix + 'pay',
    createShopCheck : shopCheckPrefix + 'create',



  };
}

export let environment = createEnv();
