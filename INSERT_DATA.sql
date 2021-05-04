## INSERTING DATA
INSERT INTO CAR_TYPE VALUES (1,'Compact','Car with 5 doors'),
							(2,'Jeep','4x4 vehicle'),
                            (3,'Convertible or Luxury','The roof is retractable'),
                            (4,'Hatchback','Small car with a flat back-side'),
                            (5,'SUV','A mix between a Sedan and a Jeep');

INSERT INTO CAR VALUES ('ABX1234','Mercedes-Benz','SLK200',3,1500.00,'NO'),
					   ('SDF4567','BMW','160i',1,750.00,'YES'),
                       ('WER3245','Suzuki','Swift',4,450.00,'YES'),
                       ('GLZ2376','Toyota','Auris',4,450.00,'NO'),
                       ('HJK1234','BMW','520i',1,750.00,'YES'),
                       ('GLS7625','Opel','Corsa',4,500.00,'NO'),
                       ('FKD8202','Nissan','Juke',5,980.00,'YES'),
                       ('HNX1890','Jeep','Grand Cherokee',2,1050.00,'YES'),
                       ('KJS1983','Volkswagen','Jetta',1,800.00,'YES'),
                       ('SDL9356','Chevrolet','Aveo',1,750.00,'YES'),
                       ('OTY7293','Audi','A3 Cabrio',3,1250.00,'NO'),
                       ('MNB8654','Honda','Civic',1,600.00,'NO'),
                       ('WDV2458','Toyota','Avalon',3,1450.00,'YES'),
                       ('CFT1908','Chevrolet','Tahoe',5,1600.00,'YES'),
                       ('WHM7619','Lincoln','MKZ',3,1600.00,'NO'),
                       ('MKWS124','Ford','Fiesta',4,450.00,'YES'),
                       ('EDM8610','Nissan','X-Trail',2,1275.00,'YES'),
                       ('AHK7325','Ford','Escape',5,1300.00,'NO'),
                       ('UHJ6782','Ford','Expedition',2,1600.00,'YES'),
                       ('MKU0172','TLX','Acura',3,1800.00,'YES'),
                       ('YSN1927','TOYOTA','Corolla',1,500.00,'YES');
                       

					
INSERT INTO CUSTOMERS VALUES ('C001','Fabiola','De La Mora','+525511486562','Mexico City','Mexico','fabidmc@gmail.com'),
							 ('C002','Ana','Schettino','+525624500066','Mexico City','Mexico','anaschettino93@gmail.com'),
                             ('C003','Carlos','Coss','+61481940340','Perth','Australia','carloscossm@gmail.com'),
                             ('C004','Jeramy','Reilly','+399543013362','New York','USA','jacobi.jodie@yahoo.com'),
                             ('C005','Pedro','Burgos','+2589785321','Madrid','Spain','burgos72@gmail.com'),
                             ('C006','Christopher','Alexander','+990208954','Newark','USA','chrisalex@gmail.com'),
                             ('C007','Reynaldo','Vela','+9908762514','Bogota','Colombia','reyvela@gmail.com'),
                             ('C008','Suresh','Kumar','+8189187546','New Delhi','India','suresh2234@gmail.com'),
                             ('C009','Santiago','Rabade','+18014481517','Salt Lake City','USA','sanrabader@gmail.com'),
                             ('C010','Margarita','Cebada','+525512366054','Mexico City','Mexico','cebadam@gmail.com');


INSERT INTO RESERVATION VALUES('B101','C010','MKWS124',4,1350,'2021-04-20 10:30:00','2021-04-23 13:00:00'),
						('B102','C007','WER3245',4,1800,'2021-04-21 11:00:00','2021-04-25 10:00:00'),
						('B103','C001','CFT1908',5,11200,'2021-04-10 13:00:00','2021-04-17 13:00:00'),
						('B104','C008','AHK7325',5,1300,'2021-04-24 13:00:00','2021-04-25 11:30:00'),
					    ('B105','C004','SDF4567',1,3000,'2021-05-01 09:00:00','2021-05-05 09:00:00'),
						('B106','C003','OTY7293',3,7500,'2021-04-16 17:00:00','2021-04-22 17:00:00'),
					    ('B107','C005','HNX1890',2,6300,'2021-05-03 08:00:00','2021-05-09 17:00:00'),
						('B108','C006','FKD8202',5,3920,'2021-05-02 08:00:00','2021-05-06 17:00:00');




