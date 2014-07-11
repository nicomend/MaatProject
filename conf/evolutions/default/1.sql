# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_category primary key (id))
;

create table product (
  id                        bigint not null,
  name                      varchar(255),
  categoryID                bigint not null,
  price                     integer,
  constraint pk_product primary key (id))
;

create table worker (
  id                        varchar(255) not null,
  name                      varchar(255),
  hire_date                 timestamp,
  constraint pk_worker primary key (id))
;

create sequence category_seq;

create sequence product_seq;

create sequence worker_seq;

alter table product add constraint fk_product_category_1 foreign key (categoryID) references category (id) on delete restrict on update restrict;
create index ix_product_category_1 on product (categoryID);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category;

drop table if exists product;

drop table if exists worker;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists category_seq;

drop sequence if exists product_seq;

drop sequence if exists worker_seq;

