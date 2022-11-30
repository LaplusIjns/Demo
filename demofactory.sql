-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-11-29 18:05:30
-- 伺服器版本： 5.7.24
-- PHP 版本： 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫: `demofactory`
--
CREATE DATABASE IF NOT EXISTS `demofactory` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `demofactory`;

-- --------------------------------------------------------

--
-- 資料表結構 `plant`
--

CREATE TABLE `plant` (
  `plantid` int(2) NOT NULL,
  `plantname` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `plant`
--

INSERT INTO `plant` (`plantid`, `plantname`) VALUES
(1, '煉一廠'),
(2, '煉二廠');

-- --------------------------------------------------------

--
-- 資料表結構 `unit`
--

CREATE TABLE `unit` (
  `fkplantid` int(2) NOT NULL,
  `unitid` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `unit`
--

INSERT INTO `unit` (`fkplantid`, `unitid`) VALUES
(1, 1100),
(1, 1200),
(2, 2100),
(2, 2200),
(2, 2300);

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `plant`
--
ALTER TABLE `plant`
  ADD PRIMARY KEY (`plantid`);

--
-- 資料表索引 `unit`
--
ALTER TABLE `unit`
  ADD PRIMARY KEY (`unitid`),
  ADD KEY `fkplantid` (`fkplantid`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `plant`
--
ALTER TABLE `plant`
  MODIFY `plantid` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- 已傾印資料表的限制式
--

--
-- 資料表的限制式 `unit`
--
ALTER TABLE `unit`
  ADD CONSTRAINT `unit_ibfk_1` FOREIGN KEY (`fkplantid`) REFERENCES `plant` (`plantid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
