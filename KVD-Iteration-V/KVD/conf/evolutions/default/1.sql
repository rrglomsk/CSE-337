# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cart (
  id                        bigint not null,
  session_id                varchar(255),
  user_email                varchar(255),
  constraint pk_cart primary key (id))
;

create table line_item (
  id                        bigint not null,
  product_id                bigint,
  cart_id                   bigint,
  quantity                  integer,
  constraint pk_line_item primary key (id))
;

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

create sequence cart_seq;

create sequence line_item_seq;

create sequence manufacturer_seq;

create sequence product_seq;

create sequence user_seq;

alter table cart add constraint fk_cart_user_1 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_cart_user_1 on cart (user_email);
alter table line_item add constraint fk_line_item_product_2 foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_line_item_product_2 on line_item (product_id);
alter table line_item add constraint fk_line_item_cart_3 foreign key (cart_id) references cart (id) on delete restrict on update restrict;
create index ix_line_item_cart_3 on line_item (cart_id);
alter table product add constraint fk_product_manufacturer_4 foreign key (manufacturer_id) references manufacturer (id) on delete restrict on update restrict;
create index ix_product_manufacturer_4 on product (manufacturer_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cart;

drop table if exists line_item;

drop table if exists manufacturer;

drop table if exists product;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists cart_seq;

drop sequence if exists line_item_seq;

drop sequence if exists manufacturer_seq;

drop sequence if exists product_seq;

drop sequence if exists user_seq;

