DROP TABLE IF EXISTS PHONE;
  
CREATE TABLE PHONE(
  pid INT AUTO_INCREMENT  PRIMARY KEY,
  number VARCHAR(10) NOT NULL,
  service_provider VARCHAR(250),
  owner_name VARCHAR(30),
  owner_address VARCHAR(30),
  state_code VARCHAR(30),
  country_code VARCHAR(30)
);

DELETE FROM `phone`;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
INSERT INTO `phone` (`pid`, `number`, `service_provider`, `owner_name`, `owner_address`, `state_code`, `country_code`) VALUES
	(1, '9977224455', 'Airtel', 'Sooryanarayana Hebbar\r\n', 'Bengaluru', 'KA', 'IN'),
	(2, '8877660099', 'VI', 'Hebbar', 'HYD', 'HY', 'IN'),
	(3, '9972243299', 'Jio', 'Ramesh Kundar', 'BLR', 'KA', 'IN'),
	(4, '9972243210', 'Jio', 'Sharath Kumar', 'BLR', 'KA', 'IN'),
	(5, '9972243215', 'Airtel', 'Gururaj Hebbar', 'BLR', 'KA', 'IN'),
	(6, '9972243220', 'VI', 'Ravi Kiran', 'BLR', 'KA', 'IN'),
	(7, '9972243225', 'Airtel', 'Saamya Hebbar', 'BLR', 'KA', 'IN'),
	(8, '9972243230', 'Airtel', 'Shourya Hebbar', 'BLR', 'KA', 'IN'),
	(9, '9972243235', 'Jio', 'Shankar', 'BLR', 'KA', 'IN'),
	(10, '9972243240', 'Airtel', 'Mejestic', 'BLR', 'KA', 'IN'),
	(11, '9972243245', 'VI', 'Vasantha', 'BLR', 'KA', 'IN'),
	(12, '9972243250', 'Airtel', 'Kanaka', 'BLR', 'KA', 'IN'),
	(13, '9972243255', 'Airtel', 'Chetheswar', 'BLR', 'AP', 'IN'),
	(14, '9972243260', 'VI', 'Vihari', 'BLR', 'TN', 'IN'),
	(15, '9972243265', 'Airtel', 'Anil Kumble', 'BLR', 'KA', 'IN'),
	(16, '9972243270', 'Jio', 'Rahul Dravid', 'BLR', 'KA', 'IN'),
	(17, '9972243275', 'Airtel', 'V V Laxman', 'BLR', 'TS', 'IN'),
	(18, '9972243280', 'VI', 'Sudeep', 'BLR', 'KA', 'IN'),
	(19, '9972243285', 'Airtel', 'Darshan', 'BLR', 'KA', 'IN'),
	(20, '9972243290', 'VI', 'Sindhu', 'BLR', 'KA', 'IN'),
	(21, '9972243295', 'Airtel', 'Vamanjooru', 'BLR', 'MP', 'IN'),
	(22, '8888843210', 'VI', 'Keerthi', 'BLR', 'KA', 'IN'),
	(23, '9978885215', 'Airtel', 'Ketki', 'BLR', 'KA', 'IN'),
	(24, '9972222210', 'Jio', 'Rao and Rao', 'BLR', 'KA', 'IN'),
	(25, '9972223215', 'Airtel', 'Wade', 'BLR', 'KA', 'IN'),
	(26, '6666243210', 'Jio', 'Smith', 'BLR', 'KA', 'IN'),
	(27, '9662743215', 'Airtel', 'John', 'BLR', 'KA', 'IN'),
	(28, '4564564565', 'VI', 'Deven', 'Ramesh', 'KA', 'IN'),
	(30, '4564564545', 'VI', 'Guruprasadh', 'Ramesh', 'KA', 'IN');