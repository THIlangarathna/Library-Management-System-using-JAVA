-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Jan 11, 2020 at 04:41 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) DEFAULT NULL,
  `PUBLISHER` varchar(255) DEFAULT NULL,
  `ISBN` varchar(255) DEFAULT NULL,
  `PUBLIDATE` varchar(255) DEFAULT NULL,
  `EDITION` varchar(255) DEFAULT NULL,
  `PRICE` int(11) DEFAULT NULL,
  `TYPE` varchar(255) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `SECTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`ID`, `NAME`, `AUTHOR`, `PUBLISHER`, `ISBN`, `PUBLIDATE`, `EDITION`, `PRICE`, `TYPE`, `CATEGORY`, `QUANTITY`, `SECTION`) VALUES
(3, 'Harry Potter 1', 'J.K.Rowling', 'Bloomsbury(UK)', '0-7475-3269-9', '1997', '2013 US Edition', 2500, 'Book', 'Art and creations', 20, '3A'),
(4, 'Java Fundamentals', 'Gazihan Alankus, Rogério Theodoro de Brito, Et al', 'packet', '97817901736', '2019', '2nd', 5400, 'Book', 'Science and Technology', 5, '4D');

-- --------------------------------------------------------

--
-- Table structure for table `lost`
--

DROP TABLE IF EXISTS `lost`;
CREATE TABLE IF NOT EXISTS `lost` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IDMEM` int(11) NOT NULL,
  `IDBOOK` int(11) NOT NULL,
  `DATEB` date NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDMEM` (`IDMEM`),
  KEY `IDBOOK` (`IDBOOK`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lost`
--

INSERT INTO `lost` (`ID`, `IDMEM`, `IDBOOK`, `DATEB`) VALUES
(14, 11, 3, '2019-12-11'),
(15, 12, 4, '2020-01-11');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `PHONENO` varchar(255) NOT NULL,
  `NSBMID` int(11) NOT NULL,
  `USERTYPE` varchar(255) NOT NULL,
  `FACULTY` varchar(255) DEFAULT NULL,
  `BATCH` varchar(255) DEFAULT NULL,
  `DEGREE` varchar(255) DEFAULT NULL,
  `STAFFTYPE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`ID`, `NAME`, `ADDRESS`, `PHONENO`, `NSBMID`, `USERTYPE`, `FACULTY`, `BATCH`, `DEGREE`, `STAFFTYPE`) VALUES
(11, 'Thilina Ilangarathna', 'No,10 SASA HS,Pallekele,Kundasale', '0769420235', 10673971, 'STUDENT', 'SOC', '18.2', 'SE Plymouth', NULL),
(12, 'S.Fernando', 'NSBM,Pitipana,Homagama', '0771234567', 11223344, 'STAFF', NULL, NULL, NULL, 'Academic'),
(14, 'P.Thilakarathne', 'Nsbm,Pitipana rd,Homagama', '071123456', 99887766, 'STAFF', NULL, NULL, NULL, 'Academic');

-- --------------------------------------------------------

--
-- Table structure for table `returnb`
--

DROP TABLE IF EXISTS `returnb`;
CREATE TABLE IF NOT EXISTS `returnb` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IDMEM` int(11) NOT NULL,
  `IDBOOK` int(11) NOT NULL,
  `DATEB` date NOT NULL,
  `DATER` date NOT NULL,
  `DATERD` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDMEM` (`IDMEM`),
  KEY `IDBOOK` (`IDBOOK`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `returnb`
--

INSERT INTO `returnb` (`ID`, `IDMEM`, `IDBOOK`, `DATEB`, `DATER`, `DATERD`) VALUES
(10, 11, 3, '2019-12-11', '2019-12-25', '2020-01-11'),
(11, 12, 4, '2020-01-11', '2020-01-25', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `QUANTITY` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`ID`, `QUANTITY`) VALUES
(3, 19),
(4, 4);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lost`
--
ALTER TABLE `lost`
  ADD CONSTRAINT `lost_ibfk_1` FOREIGN KEY (`IDMEM`) REFERENCES `member` (`ID`),
  ADD CONSTRAINT `lost_ibfk_2` FOREIGN KEY (`IDBOOK`) REFERENCES `item` (`ID`);

--
-- Constraints for table `returnb`
--
ALTER TABLE `returnb`
  ADD CONSTRAINT `returnb_ibfk_1` FOREIGN KEY (`IDMEM`) REFERENCES `member` (`ID`),
  ADD CONSTRAINT `returnb_ibfk_2` FOREIGN KEY (`IDBOOK`) REFERENCES `item` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
