CREATE SCHEMA IF NOT EXISTS delphi;

CREATE TABLE IF NOT EXISTS delphi.customer_profile (
    id integer PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS delphi.name (
    id integer PRIMARY KEY,
    name character varying(255)
);