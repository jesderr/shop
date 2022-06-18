export class CheckInfo {
  id: number | undefined;
  productId: number | undefined;
  buyerId: number | undefined;


  constructor(productId: number | undefined, buyerId: number | undefined) {
    this.productId = productId;
    this.buyerId = buyerId;
  }
}
