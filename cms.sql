-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2023 at 06:56 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cms`
--

-- --------------------------------------------------------

--
-- Table structure for table `accepted_requests`
--

CREATE TABLE `accepted_requests` (
  `student_name` varchar(25) NOT NULL,
  `father_name` varchar(25) NOT NULL,
  `nic` varchar(13) NOT NULL,
  `contact` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accepted_requests`
--

INSERT INTO `accepted_requests` (`student_name`, `father_name`, `nic`, `contact`, `address`, `email`, `password`) VALUES
('main', 'iqbal', '1234561234512', '12345612345', 'pakistan', 'the@gmail.com', '123456'),
('ali', 'bilal', '1234561234512', '12345612345', 'pindii', 'ali@gmail.com', '456789'),
('laiba', 'fareed', '1234567890123', '09876543210', 'abd', 'abc@gmail.com', '909090'),
('jadu', 'jaduKaAbu', '9393939393923', '93939393939', 'peshawar', 'jadu@gmail.com', '345543');

-- --------------------------------------------------------

--
-- Table structure for table `announcement`
--

CREATE TABLE `announcement` (
  `nannouncement` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `announcement`
--

INSERT INTO `announcement` (`nannouncement`) VALUES
('tomorrow i will return your class tests');

-- --------------------------------------------------------

--
-- Table structure for table `rejected_requests`
--

CREATE TABLE `rejected_requests` (
  `student_name` varchar(25) NOT NULL,
  `father_name` varchar(25) NOT NULL,
  `nic` varchar(13) NOT NULL,
  `contact` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rejected_requests`
--

INSERT INTO `rejected_requests` (`student_name`, `father_name`, `nic`, `contact`, `address`, `email`, `password`) VALUES
('master', 'iqbal', '0000000000000', '00000000000', 'pindi', 'main@gmail.com', '909090'),
('ali', 'akbar', '1234567891234', '12345678912', 'saddar', 'ali@gmail.com', '090909');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `cemail` varchar(25) NOT NULL,
  `maths` varchar(3) NOT NULL,
  `english` varchar(3) NOT NULL,
  `urdu` varchar(3) NOT NULL,
  `computer` varchar(3) NOT NULL,
  `total` varchar(3) NOT NULL,
  `mgrade` varchar(2) NOT NULL,
  `egrade` varchar(2) NOT NULL,
  `ugrade` varchar(2) NOT NULL,
  `cgrade` varchar(2) NOT NULL,
  `totalGrade` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`cemail`, `maths`, `english`, `urdu`, `computer`, `total`, `mgrade`, `egrade`, `ugrade`, `cgrade`, `totalGrade`) VALUES
('jadu@gmail.com', '50', '51', '52', '53', '206', 'D', 'D', 'D', 'D', 'D');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `student_name` varchar(25) NOT NULL,
  `father_name` varchar(25) NOT NULL,
  `nic` varchar(13) NOT NULL,
  `contact` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
