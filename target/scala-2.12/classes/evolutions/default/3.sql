# --- !Ups


merge into user (email,name,password,role) values ( 'admin@nuwavegames.com', 'Alice: Admin', 'password', 'admin' );

merge into user (email,name,password,role) values ( 'moderator@nuwavegames.com', 'Bob: Moderator', 'password', 'moderator' );

merge into user (email,name,password,role,amount) values ( 'registereduser@nuwavegames.com', 'Charlie: Registered User', 'password', 'registeredUser', 0 );

merge into forum_post (id, title, content, author_email, product_id) values (1, 'Test Post', 'Just a test post', 'registereduser@nuwavegames.com', 1);

merge into forum_reply (id, content, author_email, forum_post_id) values (1, 'Just a test reply', 'moderator@nuwavegames.com', 1);

merge into poll_item values (1, 'PS4', 0);
merge into poll_item values (2, 'PS3', 0);
merge into poll_item values (3, 'PSP', 0);

merge into poll values (1, 'admin@nuwavegames.com');

merge into poll_poll_item values (1, 1);
merge into poll_poll_item values (1, 2);
merge into poll_poll_item values (1, 3);