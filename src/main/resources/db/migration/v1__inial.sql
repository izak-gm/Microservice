    create table client (
        dob date not null,
        id integer not null,
        id_number integer not null,
        role_id integer,
        email varchar(255) not null,
        first_name TEXT not null,
        gender varchar(255) not null,
        id_photo_back varchar(255) not null,
        id_photo_front varchar(255) not null,
        middle_name text not null,
        passport_photo varchar(255) not null,
        phone_number varchar(255) not null,
        primary key (id)
    )
