CREATE TABLE IF NOT EXISTS productCheck(
  id SERIAL PRIMARY KEY,
  productId BIGINT references product(id),
  shopCheckId BIGINT references shopCheck(id)
);
