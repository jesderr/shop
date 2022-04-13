CREATE TABLE shopCheck(
  id BIGINT PRIMARY KEY ,
  buyerId BIGINT references buyer(id),
  operationType CHARACTER VARYING(10) NOT NULL ,
  time TIME ,
  date DATE
);
