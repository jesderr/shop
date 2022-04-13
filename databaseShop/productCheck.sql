CREATE TABLE productCheck(
  id BIGINT PRIMARY KEY ,
  productId BIGINT references product(id),
  shopCheckId BIGINT references shopCheck(id)
);
