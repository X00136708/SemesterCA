# --- Sample dataset
 
# --- !Ups

delete from product;
delete from category;

insert into category (id,name) values ( 1,'Steam' );
insert into category (id,name) values ( 2,'PS4' );
insert into category (id,name) values ( 3,'Xbox One' );
insert into category (id,name) values ( 4,'Nintendo Switch' );

 
<<<<<<< HEAD
insert into product (id,name,description,stock,price,pegi) values ( 1,'Grand Theft Auto V','When a young street hustler, a retired bank robber and a... ',100,49.99,'PEGI 18' );
insert into product (id,name,description,stock,price,pegi) values ( 2,'FIFA 18','From tiki-taka to high press, new Team Styles put the most recognised... ',45,44.99, 'PEGI 3' );
=======
insert into product (id,name,description,stock,price,pegi) values ( 1,'Grand Theft Auto V','When a young street hustler, a retired bank robber and a... ',100,49.00,'PEGI 18' );
insert into product (id,name,description,stock,price,pegi) values ( 2,'FIFA 18','From tiki-taka to high press, new Team Styles put the most recognised... ',100,44.99, 'PEGI 3' );
insert into product (id,name,description,stock,price,pegi) values ( 3,'Call of Duty® returns to its roots with Call of Duty®: WWII a breathtaking experience... ',100,64.99, 'PEGI 18' );

>>>>>>> aa4120e9331252f7dd028526e355ada7dc39cce8

 
insert into category_product (category_id,product_id) values (1,1);
insert into category_product (category_id,product_id) values (1,2);
insert into category_product (category_id,product_id) values (2,1);
insert into category_product (category_id,product_id) values (3,1);