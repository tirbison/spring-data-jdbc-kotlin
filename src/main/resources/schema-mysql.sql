drop table if exists role;

create table role
(
    id          serial primary key,
    name        varchar(256),
    permissions varchar(256)
);
