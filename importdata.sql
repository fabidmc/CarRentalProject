USE db_cars;


/* category */
INSERT INTO categories_cars (category_id, type_cars, description) VALUES (1,'Compact','Car with 5 doors');
INSERT INTO categories_cars (category_id, type_cars, description) VALUES (2,'Jeep','4x4 vehicle');
INSERT INTO categories_cars (category_id, type_cars, description) VALUES (3,'Convertible or Luxury','The roof is retractable');
INSERT INTO categories_cars (category_id, type_cars, description) VALUES (4,'Hatchback','Small car with a flat back-side');
INSERT INTO categories_cars (category_id, type_cars, description) VALUES (5,'SUV','A mix between a Sedan and a Jeep');

/* cars master data*/
INSERT INTO cars (car_id, available, brand, model, plate, prices, category_id) VALUES  (001,b'1','Mercedes-Benz','SLK200','ABX1234',1500.00,3);
INSERT INTO cars (car_id, available, brand, model, plate, prices, category_id) VALUES  (002,b'1','BMW','160i','SDF4567',750.00,1);          
INSERT INTO cars (car_id, available, brand, model, plate, prices, category_id) VALUES  (003,b'1','Suzuki','Swift','WER3245',450.00,4);          
INSERT INTO cars (car_id, available, brand, model, plate, prices, category_id) VALUES  (004,b'0','Toyota','Auris','GLZ2376',450.00,4);          

INSERT INTO clients (id_client,country,email,first_name,last_name,mobile,password,state,user_name) VALUES  (1,'Mexico','fabidmc@gmail.com','Fabiola','De la Mora','+525511486573','1234','Mexico City','fabidmc');

               