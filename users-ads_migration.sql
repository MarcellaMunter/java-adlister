drop DATABASE if EXISTS adlister_db;
create DATABASE if NOT EXISTS adlister_db;

use adlister_db;

drop table if EXISTS users;
create table if NOT EXISTS users (
  id int UNSIGNED not null AUTO_INCREMENT,
  username VARCHAR(100) not null,
  email VARCHAR(100) not null,
  password VARCHAR(100) not null,
  PRIMARY KEY (id)
);

drop table if EXISTS ads;
create table if NOT EXISTS ads (
  id int UNSIGNED not null AUTO_INCREMENT,
  user_id int (10) unsigned not null,
  title VARCHAR(50) not null,
  description text not null,
  FOREIGN KEY (user_id) REFERENCES users(id),
  PRIMARY KEY (id)
);











