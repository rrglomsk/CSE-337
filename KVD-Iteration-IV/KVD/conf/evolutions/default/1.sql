# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table manufacturer (
  id                        bigint not null,
  name                      varchar(255),
  street1                   varchar(255),
  street2                   varchar(255),
  city                      varchar(255),
  state                     varchar(255),
  zipcode                   varchar(255),
  email                     varchar(255),
  phone                     varchar(255),
  constraint pk_manufacturer primary key (id))
;

create table product (
  id                        bigint not null,
  name                      varchar(255),
  description               TEXT,
  image_url                 varchar(255),
  price                     float,
  rating                    integer,
  manufacturer_id           bigint,
  constraint pk_product primary key (id))
;

create table user (
  email                     varchar(255) not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  role                      integer,
  constraint ck_user_role check (role in (0,1,2)),
  constraint pk_user primary key (email))
;

create sequence manufacturer_seq;

create sequence product_seq;

create sequence user_seq;

alter table product add constraint fk_product_manufacturer_1 foreign key (manufacturer_id) references manufacturer (id) on delete restrict on update restrict;
create index ix_product_manufacturer_1 on product (manufacturer_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists manufacturer;

drop table if exists product;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists manufacturer_seq;

drop sequence if exists product_seq;

drop sequence if exists user_seq;

