DROP SCHEMA IF NOT EXISTs tandoorigrilldb;
CREATE SCHEMA IF NOT EXISTS tandoorigrilldb ;

CREATE TABLE IF NOT EXISTS delivery (
  deliveryID INT(6),
  actorID INT(6),
  house_number VARCHAR(20),
  unit_number VARCHAR(25),
  street VARCHAR(50),
  postal_code VARCHAR(6),
  city VARCHAR(50),
  province CHAR(2),
  note VARCHAR(300),
  contact_email VARCHAR(50),
  PRIMARY KEY (deliveryID));

CREATE TABLE IF NOT EXISTS actor (
  actorID INT(6),
  email_login VARCHAR(50) ,
  password VARCHAR(25) ,
  f_name VARCHAR(25) ,
  l_name VARCHAR(25) ,
  house_number VARCHAR(20),
  unit_number VARCHAR(25),
  postal_code VARCHAR(6),
  city VARCHAR(50),
  province CHAR(2),
  country CHAR(2),
  role CHAR(1),
  active TINYINT(1) NOT NULL,
  PRIMARY KEY (actorID));

CREATE TABLE IF NOT EXISTS favourite (
  actorID INT(6),
  itemID INT(6),
  PRIMARY KEY (actorID));

CREATE TABLE IF NOT EXISTS report (
  report_made DATETIME,
  total_income FLOAT,
  count_paypal INT(6));

CREATE TABLE IF NOT EXISTS menu (
  itemID INT(6),
  item VARCHAR(50),
  description VARCHAR(500),
  price FLOAT,
  image varchar(1000),
  PRIMARY KEY (itemID));

CREATE TABLE IF NOT EXISTS order_items (
  orderID INT(6),
  itemID INT(6),
  quantity INT(2),
  note VARCHAR(300),
  PRIMARY KEY (orderID, itemID));

CREATE TABLE IF NOT EXISTS orders (
  orderID INT(6),
  deliveryID INT(6),
  order_time DATETIME NOT NULL,
  due_date DATETIME NOT NULL,
  total_price FLOAT NOT NULL,
  status VARCHAR(20) NOT NULL,
  payment_type VARCHAR(20) NOT NULL,
  delivery_method VARCHAR(20) NOT NULL,
  PRIMARY KEY (orderID)) ;

ALTER TABLE delivery ADD FOREIGN KEY (actorID) REFERENCES actor(actorID);

ALTER TABLE favourite ADD FOREIGN KEY (actorID) REFERENCES actor(actorID);
ALTER TABLE favourite ADD FOREIGN KEY (itemID) REFERENCES menu(itemID);

ALTER TABLE order_items ADD FOREIGN KEY (orderID) REFERENCES orders(orderID);
ALTER TABLE order_items ADD FOREIGN KEY (itemID) REFERENCES menu(itemID);

ALTER TABLE orders ADD FOREIGN KEY (deliveryID) REFERENCES delivery(deliveryID);

