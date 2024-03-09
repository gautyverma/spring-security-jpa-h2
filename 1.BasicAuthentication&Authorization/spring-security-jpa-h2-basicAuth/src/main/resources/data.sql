INSERT INTO customer (`name`,`email`,`mobile_number`, `pwd`, `role`,`create_dt`)
 VALUES ('Happy','happy','9876548336', '123', 'admin',CURDATE());

INSERT INTO customer (`name`,`email`,`mobile_number`, `pwd`, `role`,`create_dt`)
 VALUES ('gojo','gojo','9876548335', '123', 'admin',CURDATE());

INSERT INTO customer (`name`,`email`,`mobile_number`, `pwd`, `role`,`create_dt`)
 VALUES ('toji','toji','9876548334', '123', 'admin',CURDATE());

 INSERT INTO authorities (`customer_id`, `id`,`name`)
   VALUES (3, 1,'VIEWCUSTOMER');

 INSERT INTO authorities (`customer_id`, `id`,`name`)
  VALUES (2, 3,'ROLE_USER');

 INSERT INTO authorities (`customer_id`, `id`,`name`)
  VALUES (1, 2,'ROLE_ADMIN');