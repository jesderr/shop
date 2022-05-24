CREATE TABLE IF NOT EXISTS buyer(
  id BIGINT PRIMARY KEY ,
  name CHARACTER VARYING(15) NOT NULL ,
  surname CHARACTER VARYING(30) NOT NULL,
  gender CHARACTER VARYING(8) NOT NULL,
  cardId BIGINT NULL
);

alter table buyer
drop constraint if exists buyer_cardid_fkey;