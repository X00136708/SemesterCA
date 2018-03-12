# --- !Ups
delete from user;

insert into user (email,name,password,role) values ( 'admin@nuwavegames.com', 'Alice: Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'moderator@nuwavegames.com', 'Bob: Moderator', 'password', 'moderator' );

insert into user (email,name,password,role) values ( 'registereduser@nuwavegames.com', 'Charlie: Registered User', 'password', 'registeredUser' );

