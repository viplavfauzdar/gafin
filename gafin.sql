-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 03, 2014 at 11:29 PM
-- Server version: 5.6.11
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gafin`
--

-- --------------------------------------------------------

--
-- Table structure for table `documents`
--

CREATE TABLE IF NOT EXISTS `documents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `document_key` varchar(200) DEFAULT NULL,
  `document` varchar(200) DEFAULT NULL,
  `downloaded_document` varchar(200) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(4) DEFAULT NULL,
  `documentscol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='Echosign documents for each user (project or investor)' AUTO_INCREMENT=16 ;

--
-- Dumping data for table `documents`
--

INSERT INTO `documents` (`id`, `user_id`, `project_id`, `document_key`, `document`, `downloaded_document`, `createdate`, `updatedate`, `deletedind`, `documentscol`) VALUES
(1, 1, NULL, '2AAABLblqZhAgnZLXadtUD52J5lpgjdCERCtIk7J9mBjnfbSVn_q-HAT6DPQC3r-5K4OpUc40n_Y*', '/docs/listingagreement.pdf', NULL, '2013-11-16 05:09:08', NULL, NULL, NULL),
(2, 2, NULL, '2AAABLblqZhBiRNAgmF0WE4ETpgVvPDKUYpZTCuFgOmEEpcPtJchQhkp3CVj9KINCRIEPJ5y3gXk*', '/docs/checklist_accinvestor.docx', NULL, '2013-11-19 18:12:25', NULL, NULL, NULL),
(3, 5, NULL, '2AAABLblqZhCSnppuqC-kDyKeSbC9HtRUP-GSoBfF8O65UZL6CR0rz3HeeT4vga0inzwsdiDsdyc*', '/docs/listingagreement.pdf', NULL, '2013-11-27 06:38:01', NULL, NULL, NULL),
(4, 6, NULL, '2AAABLblqZhAP1-vxuZfuqGeXeiGJr1rMYtxyePixeJjjj22G_-SSywskCeQkbzHvgk9IdzOvCpk*', '/docs/listingagreement.pdf', NULL, '2013-11-27 14:47:20', NULL, NULL, NULL),
(5, 7, NULL, '2AAABLblqZhBTmtA3tHlXNBvgLdWIV2hS_FAIW2vR4p5rTsZMJPWiABKgSP8_J0TSHhSrBv1tlKY*', '/docs/listingagreement.pdf', NULL, '2013-11-27 14:56:35', NULL, NULL, NULL),
(6, 8, NULL, '2AAABLblqZhCrWaivb29ikDUls07WNjmfNB0OsmFVXjQLIM4gfMVB2hEmH8GO6N_JSwkUky9vPOU*', '/docs/listingagreement.pdf', NULL, '2013-11-27 15:01:43', NULL, NULL, NULL),
(7, 9, NULL, '2AAABLblqZhDDXvrz_4FxASY5L5sh9HH8sunxicGx4YVFik3ZH1li3dTQFVtvm7A4c73aaMYhkB8*', '/docs/listingagreement.pdf', NULL, '2013-11-27 15:24:07', NULL, NULL, NULL),
(8, 10, NULL, '2AAABLblqZhAjc7pcCls9YRnYOPgv4D7HGBnUKEWuPpIInhydu7f7TwwG0sbs3LPCuFzkWAFZCbc*', '/docs/listingagreement.pdf', NULL, '2013-11-27 15:48:00', NULL, NULL, NULL),
(9, 11, NULL, '2AAABLblqZhAexIhE0aRVtjOSapQpC66o15pUjFLWnVXXh1xQchPJ_0ixXrvbMi7hSV-gBcW06JA*', '/docs/listingagreement.pdf', NULL, '2013-11-27 15:52:16', NULL, NULL, NULL),
(10, 12, NULL, '2AAABLblqZhBkOPTZ1J-o6OK6xdvMBmlbkJZoRSwWwPn1SQcG_byhJXlAVnuB_EPgQNrYqfi9nD8*', '/docs/listingagreement.pdf', NULL, '2013-11-27 16:06:58', NULL, NULL, NULL),
(11, 13, NULL, '2AAABLblqZhBWdIzHa6AtuGy18cAHiHb9sPukyLIE0qu1-KEW5C9yyjm-Oz4gliZn0Of5raQmaKw*', 'checklist_accinvestor.pdf', NULL, '2013-11-27 16:22:37', NULL, NULL, NULL),
(12, 14, NULL, '2AAABLblqZhCtLrtp39U_ug6S7Cihr7zzlEe5CcM2MGTJY-09c_WTldFOtexuAIEidFvPceAOtak*', 'listingagreement.pdf', NULL, '2013-11-27 16:28:11', NULL, NULL, NULL),
(13, 15, NULL, '2AAABLblqZhAxCJQTzkOUHDc4Q_VpOj6jDId6vTU45qLasJOkAj-YgabVsr0gaxDSk6z4AFiNK-A*', 'listingagreement.pdf', NULL, '2013-11-28 14:45:30', NULL, NULL, NULL),
(14, 16, NULL, '2AAABLblqZhBXIwLFIA-OWut4M2zoay5TaO3q9YlRk8NGmpWk4kFBVQHkcOEeasNVoUJJeYedN3M*', 'listingagreement.pdf', NULL, '2013-11-28 14:49:08', NULL, NULL, NULL),
(15, 20, NULL, '2AAABLblqZhDwcBmyfA5Pwm1wuSUvrQFA8sNn89alsNQOFS5eC-xRdoiNah6anpWCN2kxffyNCXM*', 'listingagreement.pdf', NULL, '2013-11-30 16:31:11', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `investment`
--

CREATE TABLE IF NOT EXISTS `investment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `commission` int(11) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE IF NOT EXISTS `location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `website` varchar(250) DEFAULT NULL,
  `facebook` varchar(250) DEFAULT NULL,
  `google_plus` varchar(250) DEFAULT NULL,
  `twitter` varchar(250) DEFAULT NULL,
  `linkedin` varchar(250) DEFAULT NULL,
  `phone1` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`id`, `user_id`, `address`, `city`, `state`, `zip`, `country`, `website`, `facebook`, `google_plus`, `twitter`, `linkedin`, `phone1`, `mobile`, `fax`, `createdate`, `updatedate`, `deletedind`) VALUES
(1, 1, '3340 Peachtree Road NE, Suite 1800', 'Atlanta', 'Georgia', '30326', NULL, 'http://www.tufftv.com', 'http://www.facebook.com/tufftv', NULL, NULL, NULL, '(404) 230-9600', NULL, NULL, '2013-11-16 05:17:42', NULL, NULL),
(2, 3, '123 st', 'atl', 'Georgia', '30030', NULL, NULL, NULL, NULL, NULL, NULL, '(776) 777-7777', NULL, NULL, '2013-11-27 06:21:22', NULL, NULL),
(3, 7, '212 dgfdfgdf', 'sdsf', 'Georgia', '34534', NULL, NULL, NULL, NULL, NULL, NULL, '(346) 346-4564', NULL, NULL, '2013-11-27 14:57:47', NULL, NULL),
(4, 8, '1213 sdsad', 'asdsadas', 'Georgia', '34534', NULL, NULL, NULL, NULL, NULL, NULL, '(254) 354-3543', NULL, NULL, '2013-11-27 15:03:32', NULL, NULL),
(5, 10, '123 sa', 'asd', 'Georgia', '53453', NULL, NULL, NULL, NULL, NULL, NULL, '(345) 345-3453', NULL, NULL, '2013-11-27 15:48:36', NULL, NULL),
(6, 17, '213sasf', 'sasdasd', 'Georgia', '12342', NULL, NULL, NULL, NULL, NULL, NULL, '(234) 423-4242', NULL, NULL, '2013-11-30 16:06:34', NULL, NULL),
(7, 18, '123 asd', 'saasdas', 'Georgia', '23423', NULL, NULL, NULL, NULL, NULL, NULL, '(234) 242-3424', NULL, NULL, '2013-11-30 16:08:41', NULL, NULL),
(8, 19, '133 saf', 'asdsaf', 'Georgia', '34345', NULL, NULL, NULL, NULL, NULL, NULL, '(435) 345-3453', NULL, NULL, '2013-11-30 16:30:12', NULL, NULL),
(9, 21, '123 st', 'ss', 'Georgia', '34543', NULL, NULL, NULL, NULL, NULL, NULL, '(345) 435-3453', NULL, NULL, '2014-06-03 23:22:20', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `project_name` varchar(100) DEFAULT NULL,
  `summary` varchar(500) DEFAULT NULL,
  `description` text,
  `website` varchar(250) DEFAULT NULL,
  `video_url` varchar(250) DEFAULT NULL,
  `image_1` varchar(45) DEFAULT NULL,
  `image_2` varchar(45) DEFAULT NULL,
  `image_3` varchar(45) DEFAULT NULL,
  `target_amount` int(11) DEFAULT NULL,
  `raised_amount` int(11) DEFAULT NULL,
  `commission` int(11) DEFAULT NULL,
  `approved` tinyint(4) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(4) DEFAULT NULL,
  `category` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='Approved - 0 - pending, 1 - approved, 2 -denied\nimages field' AUTO_INCREMENT=5 ;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`id`, `user_id`, `project_name`, `summary`, `description`, `website`, `video_url`, `image_1`, `image_2`, `image_3`, `target_amount`, `raised_amount`, `commission`, `approved`, `createdate`, `updatedate`, `deletedind`, `category`) VALUES
(1, 1, 'Tuff TV Media Group', 'TUFF TV launched in June 2009, and currently has a broadcast universe of approximately 36 million U.S. TV households through its network of over 41 local broadcast affiliates.', 'The network is one of the first digital broadcast channels to offer original programming targeted at men and the specific pursuits, interests, and hobbies they are passionate about. \n\n \n\nTUFF TV includes a unique and synergistic combination of programming genres aimed at the male demographic. TUFF TV provides the first-ever mix of these specific genres on one network. Programming content consists of Sports, Lifestyle, Drama, Reality, Talk, Specials, and Movies. Combined, these seven genres represent the highest-rated programming on television geared to men. TUFF TV features high profile shows such as Dog The Bounty Hunter, Punk&acirc;??d, and NCAA Division II College Football.\n\n \n\nThe Company projects that TUFF TV can grow to reach approximately 75 million homes in the United States, with a significant amount of cable and satellite carriage in addition to its free over the air broadcast coverage. TUFF TV is also available online as a live streaming television network, and will be expanding across all media platforms both domestically and worldwide. The network is ramping up to increase its reach by adding new affiliates and distribution partners, and plans to significantly grow the amount of original TUFF TV exclusive programming.\n\n \n\nMulticast digital broadcast networks such as TUFF TV are relatively new and are the fastest growing types of television networks. Examples of other types of &quot;diginets&quot; include genres targeted at women, specific ethnicities, music, and classic television. These channels are proven to generate significant advertising revenues with low cost of operations. Similar cable networks targeted at specific demographics have been sold for between $265 and $850 million each.', NULL, '//player.vimeo.com/video/79577522', NULL, NULL, NULL, 250000, NULL, NULL, NULL, '2013-11-16 05:16:15', NULL, NULL, NULL),
(2, 7, 'dfgdfgfdg', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2013-11-27 14:57:05', NULL, NULL, NULL),
(3, 8, 'dfgfdgfg', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', NULL, NULL, NULL, NULL, NULL, 50000, NULL, NULL, NULL, '2013-11-27 15:02:45', NULL, NULL, NULL),
(4, 10, 'dghgfhgfhgfhgf', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', 'Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions. Download the JDSU Network Analyzer Software Standard Edition - Free (J6838A) software and discover the power of JDSU network troubleshooting solutions.', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2013-11-27 15:48:26', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='role = Admin, Project Contact, Investor' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `mi` varchar(1) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password1` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `investor_type` varchar(1) DEFAULT NULL,
  `pptosnda` tinyint(1) DEFAULT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT NULL,
  `deletedind` tinyint(1) DEFAULT NULL,
  `locked` tinyint(4) DEFAULT NULL,
  `passreset_key` varchar(45) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `about_me` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `role_id`, `first_name`, `mi`, `last_name`, `email`, `password1`, `image`, `investor_type`, `pptosnda`, `createdate`, `updatedate`, `deletedind`, `locked`, `passreset_key`, `DOB`, `about_me`) VALUES
(1, 'lamarseals', 1, 'Lamar', NULL, 'Seals', 'seals@tufftv.com', '0273b15d3785352d4855f6658485d489d5cc0459', NULL, 'U', 1, '2013-11-16 05:09:01', NULL, NULL, NULL, NULL, '1960-01-01', NULL),
(2, 'ummagumma1', 2, 'Test', NULL, 'Tester', 'viplav.fauzdar@gmail.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'A', 1, '2013-11-19 18:12:11', NULL, NULL, NULL, NULL, '1976-04-11', NULL),
(3, 'ummagumma2', 2, 'viplav', NULL, 'fauzdar', 'viplav.fauzdar@gmail.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 06:20:56', NULL, NULL, NULL, NULL, '1987-04-11', NULL),
(4, 'jkjhjkhhjj666', 1, 'jhjhk', NULL, 'jhkj', 'hjhhjk@jhkjk.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 06:23:36', NULL, NULL, NULL, NULL, '1965-09-09', NULL),
(5, 'sdasda3434', 1, 'adssad', NULL, 'asdasda', 'asdsad@asdas.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 06:37:35', NULL, NULL, NULL, NULL, '1987-04-19', NULL),
(6, 'sdfds34545', 1, 'fghgfh', NULL, 'fghgfh', 'fghgf@sdfdsf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 14:46:54', NULL, NULL, NULL, NULL, '1987-04-03', NULL),
(7, 'asfdsfds6546465', 1, 'dfsgfdgdfg', NULL, 'dfgfdgfdg', 'dfgfdgfdg@asssadsada.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 14:56:16', NULL, NULL, NULL, NULL, '1987-05-04', NULL),
(8, 'ummagumma2013', 1, 'fgdfgfdg', NULL, 'dfgdfg', 'dfgdfgdf@sdfsdfsdf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 15:01:02', NULL, NULL, NULL, NULL, '1976-04-01', NULL),
(9, 'sdfdsf5435345', 1, 'sddsf', NULL, 'fdsdsfdsf', 'sadsad@asdsad.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 15:23:49', NULL, NULL, NULL, NULL, '1987-03-01', NULL),
(10, 'fauzdar1234', 1, 'vip', NULL, 'lav', 'fauzdar1234@fauzdar.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 15:47:39', NULL, NULL, NULL, NULL, '1987-04-19', NULL),
(11, 'fauzdar456546', 1, 'sdgfsdf', NULL, 'sdfdsfds', 'fauzdar456546@fauz.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 15:51:47', NULL, NULL, NULL, NULL, '1976-04-08', NULL),
(12, 'fauzdar12345', 1, 'ddjdkdjk', NULL, 'jdkdkkdj', 'fauzdar12345@asdas.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 16:06:32', NULL, NULL, NULL, NULL, '1987-03-09', NULL),
(13, 'fauzdar7878', 2, 'bdffgdfg', NULL, 'fgdfgdfg', 'fauzdar7878@asdas.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'A', 1, '2013-11-27 16:21:43', NULL, NULL, NULL, NULL, '1987-04-11', NULL),
(14, 'fauzdar99999', 1, 'asdasda', NULL, 'sdfsdfdsfs', 'fauzdar99999@fauz.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-27 16:27:43', NULL, NULL, NULL, NULL, '1976-03-03', NULL),
(15, 'fauzdar868686', 1, 'sdgfdgdfgdf', NULL, 'dfgdgfgdfg', 'fauzdar868686@sdfdsf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-28 14:45:03', NULL, NULL, NULL, NULL, '1976-02-01', NULL),
(16, 'fauz3434', 1, 'sdfdsfdsdsf', NULL, 'sdfdsfdsfdsfs', 'fauz3434@asdfdsf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-28 14:48:56', NULL, NULL, NULL, NULL, '1987-05-03', NULL),
(17, 'asdasd453453', 2, 'asdasdasd', NULL, 'asdasdad', 'asdasd@adasdasda.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-30 16:06:07', NULL, NULL, NULL, NULL, '1998-11-17', NULL),
(18, 'sadasdad456456', 2, 'sdgfsdfd', NULL, 'sfsdf', 'asdasd@adasdasda.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-30 16:07:27', NULL, NULL, NULL, NULL, '1993-11-04', NULL),
(19, 'sdfdsf454545', 2, 'sdgdsfsdf', NULL, 'sdfdsfdsf', 'sdfdsf@dsfdsfsdf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-30 16:29:51', NULL, NULL, NULL, NULL, '1976-02-11', NULL),
(20, 'asdasd345435', 1, 'dfdsfsd', NULL, 'sdfsdfdsf', 'sdfdsf@dsfdsfsdf.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2013-11-30 16:31:01', NULL, NULL, NULL, NULL, '1984-11-07', NULL),
(21, 'ummagumma987678', 2, 'viplav', NULL, 'fauzdar', 'v_fauz@hotmail.com', '7ce0359f12857f2a90c7de465f40a95f01cb5da9', NULL, 'U', 1, '2014-06-03 23:20:55', NULL, NULL, NULL, NULL, '1980-06-10', 'asd ads asdasd asdadasd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
