# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  registered_user_email         varchar(255),
  constraint uq_basket_registered_user_email unique (registered_user_email),
  constraint pk_basket primary key (id)
);

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table category_product (
  category_id                   bigint not null,
  product_id                    bigint not null,
  constraint pk_category_product primary key (category_id,product_id)
);

create table forum_post (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  content                       varchar(255),
  author_email                  varchar(255),
  product_id                    bigint,
  constraint pk_forum_post primary key (id)
);

create table forum_reply (
  id                            bigint auto_increment not null,
  content                       varchar(255),
  author_email                  varchar(255),
  forum_post_id                 bigint,
  constraint pk_forum_reply primary key (id)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  pegi                          varchar(255),
  constraint pk_product primary key (id)
);

create table product_review (
  id                            bigint auto_increment not null,
  content                       varchar(255),
  author_email                  varchar(255),
  product_id                    bigint,
  constraint pk_product_review primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  order_date1                   timestamp,
  name                          varchar(255),
  quantity                      integer not null,
  total                         double not null,
  is_cancellable                boolean default false not null,
  registered_user_email         varchar(255),
  constraint pk_shop_order primary key (id)
);

create table user (
  role                          varchar(31) not null,
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  confirm_password              varchar(255),
  department                    varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
  amount                        float,
  constraint pk_user primary key (email)
);

create table wallet (
  id                            bigint auto_increment not null,
  amount                        float,
  registered_user_email         varchar(255),
  constraint uq_wallet_registered_user_email unique (registered_user_email),
  constraint pk_wallet primary key (id)
);

alter table basket add constraint fk_basket_registered_user_email foreign key (registered_user_email) references user (email) on delete restrict on update restrict;

alter table category_product add constraint fk_category_product_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (category_id);

alter table category_product add constraint fk_category_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_category_product_product on category_product (product_id);

alter table forum_post add constraint fk_forum_post_author_email foreign key (author_email) references user (email) on delete restrict on update restrict;
create index ix_forum_post_author_email on forum_post (author_email);

alter table forum_post add constraint fk_forum_post_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_forum_post_product_id on forum_post (product_id);

alter table forum_reply add constraint fk_forum_reply_author_email foreign key (author_email) references user (email) on delete restrict on update restrict;
create index ix_forum_reply_author_email on forum_reply (author_email);

alter table forum_reply add constraint fk_forum_reply_forum_post_id foreign key (forum_post_id) references forum_post (id) on delete restrict on update restrict;
create index ix_forum_reply_forum_post_id on forum_reply (forum_post_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table product_review add constraint fk_product_review_author_email foreign key (author_email) references user (email) on delete restrict on update restrict;
create index ix_product_review_author_email on product_review (author_email);

alter table product_review add constraint fk_product_review_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_product_review_product_id on product_review (product_id);

alter table shop_order add constraint fk_shop_order_registered_user_email foreign key (registered_user_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_registered_user_email on shop_order (registered_user_email);

alter table wallet add constraint fk_wallet_registered_user_email foreign key (registered_user_email) references user (email) on delete restrict on update restrict;


# --- !Downs

alter table basket drop constraint if exists fk_basket_registered_user_email;

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table forum_post drop constraint if exists fk_forum_post_author_email;
drop index if exists ix_forum_post_author_email;

alter table forum_post drop constraint if exists fk_forum_post_product_id;
drop index if exists ix_forum_post_product_id;

alter table forum_reply drop constraint if exists fk_forum_reply_author_email;
drop index if exists ix_forum_reply_author_email;

alter table forum_reply drop constraint if exists fk_forum_reply_forum_post_id;
drop index if exists ix_forum_reply_forum_post_id;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table product_review drop constraint if exists fk_product_review_author_email;
drop index if exists ix_product_review_author_email;

alter table product_review drop constraint if exists fk_product_review_product_id;
drop index if exists ix_product_review_product_id;

alter table shop_order drop constraint if exists fk_shop_order_registered_user_email;
drop index if exists ix_shop_order_registered_user_email;

alter table wallet drop constraint if exists fk_wallet_registered_user_email;

drop table if exists basket;

drop table if exists category;

drop table if exists category_product;

drop table if exists forum_post;

drop table if exists forum_reply;

drop table if exists order_item;

drop table if exists product;

drop table if exists product_review;

drop table if exists shop_order;

drop table if exists user;

drop table if exists wallet;

