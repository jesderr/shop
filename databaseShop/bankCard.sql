CREATE TABLE IF NOT EXISTS bankCard(
  id SERIAL PRIMARY KEY ,
  digitCard BIGINT UNIQUE NOT NULL ,
  cvv BIGINT NOT NULL ,
  actionTime CHARACTER VARYING(45) NOT NULL ,
  cardHolder CHARACTER VARYING(45) NOT NULL
);
