-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 01, 2023 at 01:20 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `BusBooking`
--

-- --------------------------------------------------------

--
-- Table structure for table `Booking`
--

CREATE TABLE `Booking` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `pickup` varchar(100) NOT NULL,
  `destination` varchar(100) NOT NULL,
  `noOfSeats` int(11) DEFAULT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Booking`
--

INSERT INTO `Booking` (`id`, `name`, `pickup`, `destination`, `noOfSeats`, `price`) VALUES
(1, 'Booking 1', 'Abudhabi', 'Dubai', 2, 0),
(2, 'Booking 2', 'Abudhabi', 'Ras AlKhaimah', 5, 0),
(5, 'Booking 4', 'Fujairah', 'Umm AlQuwain', 6, 0),
(6, 'Booking 5', 'Ajman', 'Sharjah', 10, 0),
(8, 'Booking 7', 'Abudhabi', 'Ajman', 6, 0),
(9, 'Booking 8', 'Abudhabi', 'Fujairah', 5, 140),
(10, 'Booking 9', 'Abudhabi', 'Ras AlKhaimah', 10, 230),
(11, 'Booking 10', 'Abudhabi', 'Dubai', 2, 42),
(12, 'Booking 11', 'Abudhabi', 'Ras AlKhaimah', 2, 46),
(13, 'Book 11', 'Abudhabi', 'Fujairah', 3, 84),
(14, 'Booking 12', 'Abudhabi', 'Sharjah', 3, 45),
(15, 'Booking 13', 'Ras AlKhaimah', 'Fujairah', 6, 174);

-- --------------------------------------------------------

--
-- Table structure for table `BusStop`
--

CREATE TABLE `BusStop` (
  `stop_id` int(11) NOT NULL,
  `stop_name` varchar(100) DEFAULT NULL,
  `stop_order` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `BusStop`
--

INSERT INTO `BusStop` (`stop_id`, `stop_name`, `stop_order`) VALUES
(1, 'Abudhabi', 1),
(2, 'Dubai', 2),
(3, 'Umm AlQuwain', 3),
(4, 'Ajman', 4),
(5, 'Ras AlKhaimah', 5),
(6, 'Fujairah', 6),
(7, 'Sharjah', 7),
(8, 'Alain', 8),
(9, 'Abudhabi', 1),
(10, 'Dubai', 2),
(11, 'Umm AlQuwain', 3),
(12, 'Ajman', 4),
(13, 'Ras AlKhaimah', 5),
(14, 'Fujairah', 6),
(15, 'Sharjah', 7),
(16, 'Alain', 8),
(17, 'Abudhabi', 1),
(18, 'Dubai', 2),
(19, 'Umm AlQuwain', 3),
(20, 'Ajman', 4),
(21, 'Ras AlKhaimah', 5),
(22, 'Fujairah', 6),
(23, 'Sharjah', 7),
(24, 'Alain', 8),
(25, 'Abudhabi', 1),
(26, 'Dubai', 2),
(27, 'Umm AlQuwain', 3),
(28, 'Ajman', 4),
(29, 'Ras AlKhaimah', 5),
(30, 'Fujairah', 6),
(31, 'Sharjah', 7),
(32, 'Alain', 8);

-- --------------------------------------------------------

--
-- Table structure for table `Price`
--

CREATE TABLE `Price` (
  `id` int(11) NOT NULL,
  `start_city` varchar(200) DEFAULT NULL,
  `end_city` varchar(200) DEFAULT NULL,
  `price` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Price`
--

INSERT INTO `Price` (`id`, `start_city`, `end_city`, `price`) VALUES
(1, 'Abudhabi', 'Dubai', '21.00'),
(2, 'Abudhabi', 'Umm AlQuwain', '26.00'),
(3, 'Abudhabi', 'Ajman', '20.00'),
(4, 'Abudhabi', 'Ras AlKhaimah', '23.00'),
(5, 'Abudhabi', 'Fujairah', '28.00'),
(6, 'Abudhabi', 'Sharjah', '15.00'),
(7, 'Abudhabi', 'Alain', '27.00'),
(8, 'Dubai', 'Abudhabi', '29.00'),
(9, 'Dubai', 'Umm AlQuwain', '20.00'),
(10, 'Dubai', 'Ajman', '24.00'),
(11, 'Dubai', 'Ras AlKhaimah', '18.00'),
(12, 'Dubai', 'Fujairah', '22.00'),
(13, 'Dubai', 'Sharjah', '17.00'),
(14, 'Dubai', 'Alain', '19.00'),
(15, 'Umm AlQuwain', 'Abudhabi', '26.00'),
(16, 'Umm AlQuwain', 'Dubai', '20.00'),
(17, 'Umm AlQuwain', 'Ajman', '15.00'),
(18, 'Umm AlQuwain', 'Ras AlKhaimah', '24.00'),
(19, 'Umm AlQuwain', 'Fujairah', '21.00'),
(20, 'Umm AlQuwain', 'Sharjah', '18.00'),
(21, 'Umm AlQuwain', 'Alain', '29.00'),
(22, 'Ajman', 'Abudhabi', '20.00'),
(23, 'Ajman', 'Dubai', '24.00'),
(24, 'Ajman', 'Umm AlQuwain', '15.00'),
(25, 'Ajman', 'Ras AlKhaimah', '22.00'),
(26, 'Ajman', 'Fujairah', '26.00'),
(27, 'Ajman', 'Sharjah', '17.00'),
(28, 'Ajman', 'Alain', '21.00'),
(29, 'Ras AlKhaimah', 'Abudhabi', '23.00'),
(30, 'Ras AlKhaimah', 'Dubai', '18.00'),
(31, 'Ras AlKhaimah', 'Umm AlQuwain', '24.00'),
(32, 'Ras AlKhaimah', 'Ajman', '22.00'),
(33, 'Ras AlKhaimah', 'Fujairah', '29.00'),
(34, 'Ras AlKhaimah', 'Sharjah', '16.00'),
(35, 'Ras AlKhaimah', 'Alain', '20.00'),
(36, 'Fujairah', 'Abudhabi', '28.00'),
(37, 'Fujairah', 'Dubai', '22.00'),
(38, 'Fujairah', 'Umm AlQuwain', '21.00'),
(39, 'Fujairah', 'Ajman', '26.00'),
(40, 'Fujairah', 'Ras AlKhaimah', '29.00'),
(41, 'Fujairah', 'Sharjah', '19.00'),
(42, 'Fujairah', 'Alain', '27.00'),
(43, 'Sharjah', 'Abudhabi', '15.00'),
(44, 'Sharjah', 'Dubai', '17.00'),
(45, 'Sharjah', 'Umm AlQuwain', '18.00'),
(46, 'Sharjah', 'Ajman', '17.00'),
(47, 'Sharjah', 'Ras AlKhaimah', '16.00'),
(48, 'Sharjah', 'Fujairah', '19.00'),
(49, 'Sharjah', 'Alain', '23.00'),
(50, 'Alain', 'Abudhabi', '27.00'),
(51, 'Alain', 'Dubai', '19.00'),
(52, 'Alain', 'Umm AlQuwain', '29.00'),
(53, 'Alain', 'Ajman', '21.00'),
(54, 'Alain', 'Ras AlKhaimah', '20.00'),
(55, 'Alain', 'Fujairah', '27.00'),
(56, 'Alain', 'Sharjah', '23.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Booking`
--
ALTER TABLE `Booking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `BusStop`
--
ALTER TABLE `BusStop`
  ADD PRIMARY KEY (`stop_id`);

--
-- Indexes for table `Price`
--
ALTER TABLE `Price`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Booking`
--
ALTER TABLE `Booking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `BusStop`
--
ALTER TABLE `BusStop`
  MODIFY `stop_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `Price`
--
ALTER TABLE `Price`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
