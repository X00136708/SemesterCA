# --- Sample dataset
 
# --- !Ups


merge into category (id,name) values ( 1,'Steam' );
merge into category (id,name) values ( 2,'PS4' );
merge into category (id,name) values ( 3,'Xbox One' );
merge into category (id,name) values ( 4,'Nintendo Switch' );

 
merge into product (id,name,description,stock,price,pegi) values ( 1,'Grand Theft Auto V','When a young street hustler, a retired bank robber and a... ',100,49.99,'PEGI 18' );
merge into product (id,name,description,stock,price,pegi) values ( 2,'FIFA 18','From tiki-taka to high press, new Team Styles put the most recognised... ',45,44.99, 'PEGI 3' );
merge into product (id,name,description,stock,price,pegi) values ( 3,'The Last of Us','Journey across a decimated America in a tale of redemption and deliverance on...',100,59.99,'PEGI 18' );
merge into product (id,name,description,stock,price,pegi) values ( 4,'Uncharted 4','Join Nathan Drake on a perilous hunt for untold riches in his debut PlayStation 4 adventure...',45,54.99, 'PEGI 18' );
merge into product (id,name,description,stock,price,pegi) values ( 5,'Splatoon 2','The Great Zapfish has been stolen once again by the Octarian forces...',45,44.99, 'PEGI 3' );
merge into product (id,name,description,stock,price,pegi) values ( 6,'The Elder Scrolls V: Skyrim','The Empire of Tamriel is on the edge. The High King of Skyrim has been murdered...',35,34.99, 'PEGI 3' );
 
merge into category_product (category_id,product_id) values (1,1);
merge into category_product (category_id,product_id) values (1,2);
merge into category_product (category_id,product_id) values (2,1);
merge into category_product (category_id,product_id) values (3,1);
merge into category_product (category_id,product_id) values (3,2);
merge into category_product (category_id,product_id) values (3,3);
merge into category_product (category_id,product_id) values (2,4);
merge into category_product (category_id,product_id) values (4,5);
merge into category_product (category_id,product_id) values (1,6);
merge into category_product (category_id,product_id) values (2,6);
merge into category_product (category_id,product_id) values (3,6);
merge into category_product (category_id,product_id) values (4,6);
