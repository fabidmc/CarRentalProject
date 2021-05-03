## INSERTING DATA
INSERT INTO CAR_TYPE VALUES (1,"Compact","Car with 5 doors"),
							(2,"Jeep","4x4 vehicle"),
                            (3,'Convertible or Luxury','The roof is retractable'),
                            (4,'Hatchback','Small car with a flat back-side'),
                            (5,'SUV','A mix between a Sedan and a Jeep');

INSERT INTO CAR VALUES ("ABX1234","Mercedes-Benz","SLK200",3,1500);
					   #('SDF4567','BMW','160i',1,750),
                       #('WER3245','Suzuki','Swift',4,450),
                       #('GLZ2376','Toyota','Auris',4,450.00),
                       #('HJK1234','BMW','520i',1,750.00),
                       #('GLS7625','Opel','Corsa',4,500.00),
                       #('FKD8202','Nissan','Juke',5,980.00),
                       #('HNX1890','Jeep','Grand Cherokee',2,1050.00),
                       #('KJS1983','Volkswagen','Jetta',1,800.00),
                       #('SDL9356','Chevrolet','Aveo',1,750.00),
                       #('OTY7293','Audi','A3 Cabrio',3,1250.00),
                       #('MNB8654','Honda','Civic',1,600.00),
                       #('WDV2458','Toyota','Avalon',3,1450.00),
                       #('CFT1908','Chevrolet','Tahoe',5,1600.00),
                       #('WHM7619','Lincoln','MKZ',3,1600.00),
                       #('MKU0172','Ford','Fiesta',4,450.00),
                       #('EDM8610','Nissan','X-Trail',2,1275.00),
                       #('AHK7325','Ford','Escape',5,1300.00),
                       #('UHJ6782','Ford','Expedition',2,1600.00),
                       #('MKU0172','TLX','Acura',3,1800.00),
                       #('YSN1927','TOYOTA','Corolla',1,500.00);
                       

					
INSERT INTO CUSTOMERS VALUES ('C001','Fabiola','De La Mora','+525511486562','Mexico City','Mexico','fabidmc@gmail.com'),
							 ('C002','Ana','Schettino','+525624500066','Mexico City','Mexico','anaschettino93@gmail.com'),
                             ('C003','Carlos','Coss','+61481940340','Perth','Australia','carloscossm@gmail.com'),
                             ('C004','Jeramy','Reilly','+399543013362','New York','USA','jacobi.jodie@yahoo.com'),
                             ('C005','Pedro','Burgos','+2589785321','Madrid','Spain','burgos72@gmail.com'),
                             ('C006','Christopher','Alexander','9902089','Newark','USA','chrisalex@gmail.com'),
                             ('C007','Reynaldo','Vela','9908762514','Bogota','Colombia','reyvela@gmail.com'),
                             ('C008','Suresh','Kumar','8189187546','New Delhi','India','suresh2234@gmail.com'),
                             ('C009','Santiago','Rabade','+18014481517','Salt Lake City','USA','sanrabader@gmail.com'),
                             ('C010','Margarita','Cebada','5512366054','Mexico City','Mexico','cebadam@gmail.com');


INSERT INTO RESERVATION VALUES('B101',TO_TIMESTAMP('2021-04-20 10:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2021-04-23 10:00:00', 'YYYY-MM-DD HH24:MI:SS'),150,'ABX1234','F1234554',NULL,'D756'),
('B102',TO_TIMESTAMP('2016-01-21 11:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-01-24 10:00:00', 'YYYY-MM-DD HH24:MI:SS'),90,'SDF4567','T0981237',NULL,NULL,NULL),
('B103',TO_TIMESTAMP('2016-02-10 13:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-01-15 13:00:00', 'YYYY-MM-DD HH24:MI:SS'),450,'R','QSC8709','R8763578','I201',NULL),
('B104',TO_TIMESTAMP('2016-04-24 13:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-04-25 20:30:00', 'YYYY-MM-DD HH24:MI:SS'),48,'R','WLZ8955','F0091266','I202','D234'),
('B105',TO_TIMESTAMP('2016-04-18 09:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-04-25 09:00:00', 'YYYY-MM-DD HH24:MI:SS'),266,'B','POI7281','P1234567',NULL,NULL,'D972'),
('B106',TO_TIMESTAMP('2016-04-21 17:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-04-25 17:00:00', 'YYYY-MM-DD HH24:MI:SS'),168,'B','HNX1890','V5690245','I203',NULL,'D234'),
('B107',TO_TIMESTAMP('2016-04-16 08:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-04-25 17:00:00', 'YYYY-MM-DD HH24:MI:SS'),405,'B','SDF4567','I3478953','I201',NULL,'D756'),
('B108',TO_TIMESTAMP('2016-04-11 08:00:00', 'YYYY-MM-DD HH24:MI:SS'),TO_TIMESTAMP('2016-04-25 17:00:00', 'YYYY-MM-DD HH24:MI:SS'),630,'B','HJK1234','T0981237','I201',NULL,'D756');




