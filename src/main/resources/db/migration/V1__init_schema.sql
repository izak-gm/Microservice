CREATE SEQUENCE IF NOT EXISTS public.user_sequence START 1 INCREMENT 1;

CREATE TABLE IF NOT EXISTS public._user (
    id INT PRIMARY KEY DEFAULT nextval('user_sequence'),
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    password VARCHAR(255),
    phone_number VARCHAR(255),
    gender VARCHAR(50),
    dob VARCHAR(50),
    email VARCHAR(255) UNIQUE,
    auth VARCHAR(50),
    is_enabled BOOLEAN DEFAULT TRUE,
    is_account_non_locked BOOLEAN DEFAULT TRUE,
    is_credentials_non_expired BOOLEAN DEFAULT TRUE,
    is_account_non_expired BOOLEAN DEFAULT TRUE
);