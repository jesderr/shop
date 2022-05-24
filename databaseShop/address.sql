CREATE TABLE IF NOT EXISTS address(
    id          SERIAL PRIMARY KEY,
    houseNumber BIGINT                NOT NULL,
    street      CHARACTER VARYING(15) NOT NULL,
    city        CHARACTER VARYING(15) NOT NULL
);