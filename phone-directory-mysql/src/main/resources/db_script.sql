-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.15 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for phone-directory
CREATE DATABASE IF NOT EXISTS `phone-directory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `phone-directory`;

-- Dumping structure for table phone-directory.phone
CREATE TABLE IF NOT EXISTS `phone` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(10) NOT NULL DEFAULT '0',
  `service_provider` varchar(20) DEFAULT '0',
  `owner_name` varchar(30) DEFAULT '0',
  `owner_address` varchar(30) DEFAULT '0',
  `state_code` varchar(30) DEFAULT '0',
  `country_code` varchar(30) DEFAULT '0',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `number` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table phone-directory.phone: ~28 rows (approximately)
DELETE FROM `phone`;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
INSERT INTO `phone` (`pid`, `number`, `service_provider`, `owner_name`, `owner_address`, `state_code`, `country_code`) VALUES
	(1, '9977224455', 'Airtel', 'sn', 'Bengaluru', 'KA', 'IN'),
	(2, '8877660099', 'VI', 'kp', 'HYD', 'HY', '0'),
	(3, '9972243299', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(4, '9972243210', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(5, '9972243215', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(6, '9972243220', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(7, '9972243225', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(8, '9972243230', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(9, '9972243235', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(10, '9972243240', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(11, '9972243245', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(12, '9972243250', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(13, '9972243255', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(14, '9972243260', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(15, '9972243265', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(16, '9972243270', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(17, '9972243275', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(18, '9972243280', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(19, '9972243285', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(20, '9972243290', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(21, '9972243295', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(22, '8888843210', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(23, '9978885215', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(24, '9972222210', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(25, '9972223215', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(26, '6666243210', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(27, '9662743215', 'Airtel', 'sn', 'BLR', 'KA', 'IN'),
	(28, '4564564565', 'VI', 'KK', 'Ramesh', 'KA', 'IN'),
	(30, '4564564545', 'VI', 'KK', 'Ramesh', 'KA', 'IN');
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
