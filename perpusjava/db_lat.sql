-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 27, 2016 at 07:31 AM
-- Server version: 5.1.33
-- PHP Version: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_lat`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `kd_buku` varchar(25) NOT NULL,
  `judul` varchar(25) NOT NULL,
  `pengarang` varchar(25) NOT NULL,
  `penerbit` varchar(25) NOT NULL,
  `harga` varchar(25) NOT NULL,
  PRIMARY KEY (`kd_buku`),
  KEY `kd_buku` (`kd_buku`),
  KEY `kd_buku_2` (`kd_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kd_buku`, `judul`, `pengarang`, `penerbit`, `harga`) VALUES
('09', '09buku', '09pengarang', '09penerbit', '3'),
('3334', 'asdasd', 'asdasd', 'asdd', '3'),
('441', 'php', 'aiman', 'fadhil', '200'),
('buku1', 'java', 'asep', 'erlangga', '500');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `npm` varchar(25) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `jenis_kelamin` varchar(25) NOT NULL,
  `prodi` varchar(25) NOT NULL,
  PRIMARY KEY (`npm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama`, `jenis_kelamin`, `prodi`) VALUES
('1222', '3333', 'Pria', 'Teknik_Informatika'),
('140203100021', 'lukman', 'Pria', 'Teknik Informatika'),
('3231', 'fadhil', 'Pria', 'Teknik Informatika'),
('3333', 'fadhil', 'Pria', 'Teknik Informatika'),
('4123', 'maiman', 'Pria', 'Manajemen_Informatika'),
('prodi', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `sementara`
--

CREATE TABLE IF NOT EXISTS `sementara` (
  `npm` varchar(13) NOT NULL,
  `tgl_kembali` int(11) NOT NULL,
  KEY `npm` (`npm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sementara`
--

INSERT INTO `sementara` (`npm`, `tgl_kembali`) VALUES
('140203100021', 734457),
('3231', 733991);

-- --------------------------------------------------------

--
-- Table structure for table `t_kembali`
--

CREATE TABLE IF NOT EXISTS `t_kembali` (
  `npm` varchar(13) NOT NULL,
  `tgl_pengembalian` varchar(13) NOT NULL,
  `denda` int(11) DEFAULT NULL,
  KEY `npm` (`npm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_kembali`
--

INSERT INTO `t_kembali` (`npm`, `tgl_pengembalian`, `denda`) VALUES
('140203100021', '20-2-2012', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `t_peminjaman`
--

CREATE TABLE IF NOT EXISTS `t_peminjaman` (
  `npm` varchar(13) NOT NULL,
  `kd_buku` varchar(25) NOT NULL,
  `tgl_pinjam` varchar(13) NOT NULL,
  `tgl_kembali` varchar(13) NOT NULL,
  `lama` int(11) NOT NULL,
  PRIMARY KEY (`npm`),
  KEY `kode` (`kd_buku`),
  KEY `kd_buku` (`kd_buku`),
  KEY `kd_buku_2` (`kd_buku`),
  KEY `kd_buku_3` (`kd_buku`),
  KEY `kd_buku_4` (`kd_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_peminjaman`
--

INSERT INTO `t_peminjaman` (`npm`, `kd_buku`, `tgl_pinjam`, `tgl_kembali`, `lama`) VALUES
('140203100021', 'buku1', '12-2-2012', '17-2-2012', 5),
('3231', '441', '', '', 31);

-- --------------------------------------------------------

--
-- Table structure for table `t_total`
--

CREATE TABLE IF NOT EXISTS `t_total` (
  `npm` varchar(13) NOT NULL,
  `kd_buku` varchar(25) NOT NULL,
  `biaya` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  KEY `npm` (`npm`),
  KEY `kd_buku` (`kd_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_total`
--

INSERT INTO `t_total` (`npm`, `kd_buku`, `biaya`, `total`) VALUES
('140203100021', 'buku1', 2500, 5500);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sementara`
--
ALTER TABLE `sementara`
  ADD CONSTRAINT `sementara_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `t_peminjaman` (`npm`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `t_kembali`
--
ALTER TABLE `t_kembali`
  ADD CONSTRAINT `t_kembali_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `t_peminjaman` (`npm`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `t_total`
--
ALTER TABLE `t_total`
  ADD CONSTRAINT `t_total_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `t_peminjaman` (`npm`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_total_ibfk_2` FOREIGN KEY (`kd_buku`) REFERENCES `buku` (`kd_buku`) ON DELETE CASCADE ON UPDATE CASCADE;
