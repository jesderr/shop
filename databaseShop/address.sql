CREATE TABLE address(
    id          BIGINT PRIMARY KEY,
    houseNumber BIGINT                NOT NULL,
    street      CHARACTER VARYING(15) NOT NULL,
    city        CHARACTER VARYING(15) NOT NULL
);