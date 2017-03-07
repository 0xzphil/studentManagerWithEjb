-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2017 at 12:47 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentm`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(255) NOT NULL,
  `name` varchar(99) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `msv` varchar(99) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `qq` varchar(999) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `email` varchar(999) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `phone_number` varchar(99) NOT NULL,
  `date_of_birth` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `msv`, `qq`, `email`, `sex`, `phone_number`, `date_of_birth`) VALUES
(1, 'Tôi là ai', '14020340', 'Thái Bình', 'fizz.uet@gmail.com', 1, '0989328256', '1996-01-18'),
(12, 'Tên là gì', 'sdsdfsdf', 'Hà Nam', 'sdfsdf', 1, '0989328256', '1998-01-15'),
(13, 'Thái Bình', 'sdsdfsdf', 'Hải Phòng', 'sdfsdf', 1, '0989328256', '1998-01-14'),
(15, 'Hà Nội', 'shjsdhfjs', 'Thái Nguyên', 'hsdjfhsdj', 0, '0989328256', '1997-01-20'),
(17, 'tr', 'sdffsd', 'Hà Đông', 'sdffsd', 1, '0989328256', '1886-01-12'),
(19, 'fsdfsfdsfs', 'fsdfsfdsfs', 'Hà Tây', 'fsdfsfdsfs', 1, '0989328256', '1885-01-23'),
(22, 'Tesst', '14020340', 'Hà Nội', 'fizz.uet@gmail.com', 1, '0989328256', '1997-01-03'),
(23, 'Tôi là ai', '15060450', 'Thái Bình', 'ffdsf@gmail.com', 1, '0984328456', '1996-01-04'),
(24, 'Thịnh Nguyễn Văn', '15067894', 'Nam Định', 'thanh@gmail.com', 1, '0168456367', '1994-01-04'),
(25, 'ataystdays', 'ataystdays', 'ataystdays', 'ataystdays@gmail.com', 1, '8987843526', '1996-07-09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
