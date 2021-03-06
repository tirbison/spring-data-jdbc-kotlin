drop table if exists segment_attribute_value;
drop table if exists segment_rule;
drop table if exists experiment_variant;
drop table if exists experiment;

create table game
(
    id                      integer identity primary key,
    name                    varchar(256)
);

create table rule
(
    id                 integer identity primary key,
    game         integer references game (id),
    game_key     integer,
    name               varchar(256)

);

create table rule_value
(
    id               integer identity primary key,
    rule             integer references rule (id),
    rule_key integer,
    value            varchar(2048)
);
