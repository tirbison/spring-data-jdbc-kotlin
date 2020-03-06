drop table if exists rule_value;
drop table if exists rule;
drop table if exists game;

create table game
(
    id    serial primary key,
    name  varchar(256),
    types varchar(256)
);

create table rule
(
    id       serial primary key,
    game     integer references game (id),
    game_key integer,
    name     varchar(256)

);

create table rule_value
(
    rule     integer references rule (id),
    rule_key integer,
    value    varchar(2048)
);
