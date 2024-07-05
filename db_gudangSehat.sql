/*
SQLyog Professional v12.5.1 (64 bit)
MySQL - 10.4.28-MariaDB : Database - db_gudangSehat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_gudangSehat` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `db_gudangSehat`;

/*Table structure for table `tb_detail_obt_keluar` */

DROP TABLE IF EXISTS `tb_detail_obt_keluar`;

CREATE TABLE `tb_detail_obt_keluar` (
  `tanggal` varchar(100) NOT NULL,
  `id_detail_bk` varchar(100) NOT NULL,
  `id_bk` varchar(100) NOT NULL,
  `gudang` varchar(250) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(250) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  PRIMARY KEY (`id_detail_bk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_detail_obt_keluar` */

insert  into `tb_detail_obt_keluar`(`tanggal`,`id_detail_bk`,`id_bk`,`gudang`,`kode_obat`,`nama_obat`,`jumlah`,`keterangan`) values 
('01-05-2019','DTBK-0001','BK-000001','Jakarta Pusat','MTLAK01','Aki Kering',7,''),
('01-05-2019','DTBK-0002','BK-000002','Jakarta Pusat','MTLCP01','Sembarangan',10,''),
('01-05-2019','DTBK-0003','BK-000002','Jakarta Pusat','MTLAK01','Aki Kering',5,''),
('18-05-2019','DTBK-0004','BK-000003','HEAD OFFICE','BPPBLHL','Bushing Pen Per Belakang Hino Lohan',2,''),
('18-05-2019','DTBK-0005','BK-000003','HEAD OFFICE','BPPDPHL','Bushing Pen Per Depan Hino Lohan',5,'');

/*Table structure for table `tb_detail_obt_masuk` */

DROP TABLE IF EXISTS `tb_detail_obt_masuk`;

CREATE TABLE `tb_detail_obt_masuk` (
  `tanggal` varchar(100) NOT NULL,
  `id_detail_bm` varchar(100) NOT NULL,
  `id_bm` varchar(100) NOT NULL,
  `supplier` varchar(250) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(250) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  PRIMARY KEY (`id_detail_bm`),
  KEY `kode_obat` (`kode_obat`),
  CONSTRAINT `tb_detail_obt_masuk_ibfk_1` FOREIGN KEY (`kode_obat`) REFERENCES `tb_obat` (`kode_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_detail_obt_masuk` */

insert  into `tb_detail_obt_masuk`(`tanggal`,`id_detail_bm`,`id_bm`,`supplier`,`kode_obat`,`nama_obat`,`jumlah`,`keterangan`) values 
('11-05-2019','DTBM-0001','BM-000001','Damindo Utama','FS1242FG','Filter Solar Fleetguard',2,'Loader Liugong CLG835 MCC2B'),
('11-05-2019','DTBM-0002','BM-000001','Damindo Utama','FS1280FG','Filter Separator Fleetguard',2,'Loader Liugong CLG835 MCC2B'),
('11-05-2019','DTBM-0003','BM-000001','Damindo Utama','LF3959FG','Filter Oli Fleetguard',2,'Loader Liugong CLG835 MCC2B'),
('12-05-2019','DTBM-0004','BM-000002','Damindo Utama','J8610120','Filter Oli Donaldson',3,'Loader Komatsu WA350 CIPANAS'),
('12-05-2019','DTBM-0005','BM-000002','Damindo Utama','J8610120','Filter Oli Donaldson',3,'Loader Komatsu WA300 CIPANAS'),
('11-05-2019','DTBM-0006','BM-000002','Damindo Utama','J8622221','Filter Solar Donaldson',8,'Loader Komatsu WA350 CIPANAS'),
('12-05-2019','DTBM-0007','BM-000002','Damindo Utama','J8622221','Filter Solar Donaldson',6,'Loader Komatsu WA300 CIPANAS'),
('13-05-2019','DTBM-0008','BM-000003','Cahaya Autopart','BPPBLHL','Bushing Pen Per Belakang Hino Lohan',8,'TM 107 CISUMDAWU 2'),
('13-05-2019','DTBM-0009','BM-000003','Cahaya Autopart','BPPDPHL','Bushing Pen Per Depan Hino Lohan',4,'TM 106 CISUMDAWU 2'),
('13-05-2019','DTBM-0010','BM-000003','Cahaya Autopart','KDHLHOP','Karet Dingdong Hino Lohan HOP',14,'Stok TM CISUMDAWU 2'),
('18-05-2019','DTBM-0011','BM-000004','Damindo Utama','BPPBLHL','Bushing Pen Per Belakang Hino Lohan',3,''),
('18-05-2019','DTBM-0012','BM-000004','Damindo Utama','BPPDPHL','Bushing Pen Per Depan Hino Lohan',8,'');

/*Table structure for table `tb_gudang` */

DROP TABLE IF EXISTS `tb_gudang`;

CREATE TABLE `tb_gudang` (
  `tanggal` varchar(100) NOT NULL,
  `kode_gudang` varchar(100) NOT NULL,
  `nama_gudang` varchar(250) NOT NULL,
  `alamat` varchar(500) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  PRIMARY KEY (`kode_gudang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_gudang` */

insert  into `tb_gudang`(`tanggal`,`kode_gudang`,`nama_gudang`,`alamat`,`keterangan`) values 
('01-05-2019','GD01MS','MEKARSARI','Jln. Cileungsi KM 05, Mekarsari','Gudang Pusat'),
('01-05-2019','GD02HO','HEAD OFFICE','Jln. Boulevard Barat, Kelapa Gading','Gudang Sementara'),
('01-05-2019','GD03CD','CISUMDAWU 2','Jln. Panyindangan, Sumedang','Gudang Plant Cisumdawu 2'),
('01-05-2019','GD04M2','MCC2B','Ciherang Selatan, Sumedang','Gudang Plant MCC2B'),
('01-05-2019','GD05CS','CIPANAS','Ds. Cibuluh, Ujung Jaya, Sumedang','Gudang Plant Cipanas'),
('01-05-2019','GD06B5','BALSAM 5','Jln. Ampera NO.90, Kalimantan','Gudang Plant Balsam 5'),
('01-05-2019','GD07B6','BALSAM 6','Kec. Palaran, Samarinda','Gudang Plant Balsam 6'),
('01-05-2019','GD08B9','BALSAM 9','Rawa Makmur, Kalimantan Timur','Gudang Plant Balsam 9'),
('01-05-2019','GD09SP','SORONG','Jln. Jendral Sudirman No.50, Papua','Gudang Plant Sorong');

/*Table structure for table `tb_kategori` */

DROP TABLE IF EXISTS `tb_kategori`;

CREATE TABLE `tb_kategori` (
  `tanggal` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `keterangan` varchar(500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`kode_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

/*Data for the table `tb_kategori` */

insert  into `tb_kategori`(`tanggal`,`kode_kategori`,`nama_kategori`,`keterangan`) values 
('01-05-2019','TMHLJO8C','Truck Mixer Hino Lohan ','Sparepart Kendaraan Hino Lohan '),
('01-05-2019','WLKWA300','Wheel Loader Komatsu WA300','Sparepart Kendaraan Alat Berat Loader'),
('01-05-2019','WLKWA350','Wheel Loader Komatsu WA350','Sparepart Kendaraan Alat Berat Loader'),
('11-05-2019','WLLCL835','Wheel Loader Liugong CLG-835','Sparepart Kendaraan Alat Berat Loader ');

/*Table structure for table `tb_obat` */

DROP TABLE IF EXISTS `tb_obat`;

CREATE TABLE `tb_obat` (
  `tanggal` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_obat` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_obat` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `jumlah` int(11) NOT NULL,
  `satuan` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `keterangan` varchar(500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`kode_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

/*Data for the table `tb_obat` */

insert  into `tb_obat`(`tanggal`,`kode_obat`,`nama_obat`,`kode_kategori`,`nama_kategori`,`jumlah`,`satuan`,`keterangan`) values 
('11-05-2019','BPPBLHL','Bushing Pen Per Belakang Hino Lohan','TMHLJO8C','Truck Mixer Hino Lohan ',10,'BKS','Untuk TM Hino Lohan'),
('11-05-2019','BPPDPHL','Bushing Pen Per Depan Hino Lohan','','Truck Mixer Hino Lohan ',7,'',''),
('11-05-2019','FS1242FG','Filter Solar Fleetguard','','Wheel Loader Liugong CLG-835',2,'',''),
('11-05-2019','FS1280FG','Filter Separator Fleetguard','','Wheel Loader Liugong CLG-835',2,'',''),
('11-05-2019','J8532431','Filter Udara Jimco','','Wheel Loader Komatsu WA300',0,'',''),
('11-05-2019','J8610120','Filter Oli Donaldson','','Wheel Loader Komatsu WA350',6,'',''),
('11-05-2019','J8622221','Filter Solar Donaldson','','Wheel Loader Komatsu WA350',14,'',''),
('11-05-2019','J8640071','Filter Water Donaldson','','Wheel Loader Komatsu WA300',0,'',''),
('11-05-2019','KDHLHOP','Karet Dingdong Hino Lohan HOP','','Truck Mixer Hino Lohan ',0,'',''),
('11-05-2019','LF3959FG','Filter Oli Fleetguard','','Wheel Loader Liugong CLG-835',2,'',''),
('27-04-2024','OB2404001','Bodrex','WLKWA300','Wheel Loader Komatsu WA300',10,'Ampul','efasd'),
('27-04-2024','OB2404002','Komix jahe','WLKWA300','Wheel Loader Komatsu WA300',20,'Dus','Obat Batuk'),
('11-05-2019','P181139','Filter Udara Donaldson','','Wheel Loader Komatsu WA350',0,'','');

/*Table structure for table `tb_obat_keluar` */

DROP TABLE IF EXISTS `tb_obat_keluar`;

CREATE TABLE `tb_obat_keluar` (
  `tanggal` varchar(100) NOT NULL,
  `id_bk` varchar(100) NOT NULL,
  `gudang` varchar(250) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  PRIMARY KEY (`id_bk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_obat_keluar` */

insert  into `tb_obat_keluar`(`tanggal`,`id_bk`,`gudang`,`keterangan`) values 
('01-05-2019','BK-000001','Jakarta Pusat',''),
('01-05-2019','BK-000002','Jakarta Pusat',''),
('18-05-2019','BK-000003','HEAD OFFICE','');

/*Table structure for table `tb_obat_masuk` */

DROP TABLE IF EXISTS `tb_obat_masuk`;

CREATE TABLE `tb_obat_masuk` (
  `tanggal` varchar(100) NOT NULL,
  `id_bm` varchar(100) NOT NULL,
  `supplier` varchar(250) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  PRIMARY KEY (`id_bm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_obat_masuk` */

insert  into `tb_obat_masuk`(`tanggal`,`id_bm`,`supplier`,`keterangan`) values 
('13-05-2019','BM-000001','Cahaya Autopart',''),
('11-05-2019','BM-000002','Damindo Utama',''),
('13-05-2019','BM-000003','Cahaya Autopart','TM 106 CISUMDAWU 2'),
('18-05-2019','BM-000004','Damindo Utama','');

/*Table structure for table `tb_supplier` */

DROP TABLE IF EXISTS `tb_supplier`;

CREATE TABLE `tb_supplier` (
  `tanggal` varchar(100) NOT NULL,
  `kode_supplier` varchar(100) NOT NULL,
  `nama_supplier` varchar(250) NOT NULL,
  `notelpon_supplier` varchar(20) NOT NULL,
  `alamat_supplier` varchar(500) NOT NULL,
  PRIMARY KEY (`kode_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_supplier` */

insert  into `tb_supplier`(`tanggal`,`kode_supplier`,`nama_supplier`,`notelpon_supplier`,`alamat_supplier`) values 
('01-05-2019','CA01TMPR','Cahaya Autopart','021-6598414','Jln. Karang Anyar No.10B, Jakarta'),
('01-05-2019','DU01TGLS','Damindo Utama','021-22685616','Jln. Taman Sari, Asam Reges, Jakarta');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `level` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`password`,`level`) values 
(1,'admin','admin','admin');

/* Trigger structure for table `tb_detail_obt_keluar` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `keluar` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `keluar` AFTER INSERT ON `tb_detail_obt_keluar` FOR EACH ROW BEGIN
	UPDATE tb_barang SET jumlah = jumlah-NEW.jumlah
    WHERE kode_part = NEW.kode_part;
END */$$


DELIMITER ;

/* Trigger structure for table `tb_detail_obt_keluar` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `batal_keluar` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `batal_keluar` AFTER DELETE ON `tb_detail_obt_keluar` FOR EACH ROW BEGIN
	UPDATE tb_barang SET jumlah = jumlah+OLD.jumlah
    WHERE kode_part = OLD.kode_part;
END */$$


DELIMITER ;

/* Trigger structure for table `tb_detail_obt_masuk` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `tambah` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `tambah` AFTER INSERT ON `tb_detail_obt_masuk` FOR EACH ROW BEGIN
	UPDATE tb_barang SET jumlah = jumlah+NEW.jumlah
    WHERE kode_part = NEW.kode_part;
END */$$


DELIMITER ;

/* Trigger structure for table `tb_detail_obt_masuk` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `batal_tambah` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `batal_tambah` AFTER DELETE ON `tb_detail_obt_masuk` FOR EACH ROW BEGIN
	UPDATE tb_barang SET jumlah = jumlah-OLD.jumlah
    WHERE kode_part = OLD.kode_part;
END */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
