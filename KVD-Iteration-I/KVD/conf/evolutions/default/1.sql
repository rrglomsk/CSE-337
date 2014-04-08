# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                        bigint not null,
  name                      varchar(255),
  description               TEXT,
  image_url                 varchar(255),
  price                     float,
  rating                    integer,
  constraint pk_product primary key (id))
;

create table user (
  email                     varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  role                      integer,
  constraint ck_user_role check (role in (0,1,2)))
;

create sequence product_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists product;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists product_seq;

