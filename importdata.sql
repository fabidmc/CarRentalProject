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
INSERT INTO clients (id_client,country,email,first_name,last_name,mobile,password,state,user_name) VALUES  (2,'USA','jacobi.jodie@yahoo.com','Jeramy','Reilly','+399543013362','jeremy23','New York','jacobi');
INSERT INTO clients (id_client,country,email,first_name,last_name,mobile,password,state,user_name) VALUES  (3,'Spain','burgos72@gmail.com','Pedro','Burgos','+2589785321','14567','Madrid','burgospedro');
INSERT INTO clients (id_client,country,email,first_name,last_name,mobile,password,state,user_name) VALUES  (4,'USA','chrisalex@gmail.com','Christopher','Alexander','+990208954','5igoti3','Newark','chrisalex');
INSERT INTO clients (id_client,country,email,first_name,last_name,mobile,password,state,user_name) VALUES  (5,'Colombia','reyvela@gmail.com','Reynaldo','Vela','+9908762514','rey92494','Bogota','reyvela');


INSERT INTO reservations (id_reservation, pick_date, return_date, total_amount, plate, category_id, last_name) VALUES (100,'2021-04-20','2021-04-23',1350.00,'MKWS124',4,'Cebada');
INSERT INTO reservations (id_reservation, pick_date, return_date, total_amount, plate, category_id, last_name) VALUES (200,'2021-04-21','2021-04-25',1800.00,'WER3245',4,'Vela');
INSERT INTO reservations (id_reservation, pick_date, return_date, total_amount, plate, category_id, last_name) VALUES (300,'2021-04-10','2021-04-17',11200.00,'CFT1908',5,'De la Mora');
INSERT INTO reservations (id_reservation, pick_date, return_date, total_amount, plate, category_id, last_name) VALUES (400,'2021-04-24','2021-04-25',1300.00,'AHK7325',5,'Kumar');
INSERT INTO reservations (id_reservation, pick_date, return_date, total_amount, plate, category_id, last_name) VALUES (500,'2021-05-01','2021-05-05',3000.00,'SDF4567',1,'Reilly');

						
					
						
					
						


               