drop table if exists game;

create table game
(
    id    serial primary key,
    name  varchar(256),
    types varchar(256)
);
