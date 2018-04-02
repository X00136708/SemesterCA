# --- !Ups
delete from forum_reply;
delete from forum_post;
delete from user;

insert into user (email,name,password,role) values ( 'admin@nuwavegames.com', 'Alice: Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'moderator@nuwavegames.com', 'Bob: Moderator', 'password', 'moderator' );

insert into user (email,name,password,role,amount) values ( 'registereduser@nuwavegames.com', 'Charlie: Registered User', 'password', 'registeredUser', 0 );

insert into forum_post (id, title, content, author_email, product_id) values (1, 'Test Post', 'Just a test post', 'registereduser@nuwavegames.com', 1);

insert into forum_reply (id, content, author_email, forum_post_id) values (1, 'Just a test reply', 'moderator@nuwavegames.com', 1);