-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Jul 2024 pada 19.55
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_gudangsehat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_gudang`
--

CREATE TABLE `tb_gudang` (
  `tanggal` varchar(100) NOT NULL,
  `kode_gudang` varchar(100) NOT NULL,
  `nama_gudang` varchar(250) NOT NULL,
  `alamat` varchar(500) NOT NULL,
  `keterangan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tb_gudang`
--

INSERT INTO `tb_gudang` (`tanggal`, `kode_gudang`, `nama_gudang`, `alamat`, `keterangan`) VALUES
('01-05-2019', 'GD05CS', 'CIPANAS PUNCAK', 'Ds. Cibuluh, Ujung Jaya, Sumedang', 'Gudang Plant Cipanas'),
('01-05-2019', 'GD06B5', 'BALSAM 5', 'Jln. Ampera NO.90, Kalimantan', 'Gudang Plant Balsam 5'),
('01-05-2019', 'GD07B6', 'BALSAM 6', 'Kec. Palaran, Samarinda', 'Gudang Plant Balsam 6'),
('01-05-2019', 'GD08B9', 'BALSAM 9', 'Rawa Makmur, Kalimantan Timur', 'Gudang Plant Balsam 9'),
('01-05-2019', 'GD09SP', 'SORONG', 'Jln. Jendral Sudirman No.50, Papua', 'Gudang Plant Sorong'),
('5/21/2024\r\n', 'GUD001\r\n', 'Apotek Sehat', 'Jl. Sehat No. 1, Jakarta', ''),
('5/21/2024\r\n', 'GUD002\r\n', 'Apotek Cemerlang', 'Jl. Cemerlang No. 2, Surabaya', ''),
('5/21/2024\r\n', 'GUD003\r\n', 'Apotek Bersama', 'Jl. Bersama No. 3, Bandung', ''),
('5/21/2024\r\n', 'GUD004\r\n', 'Apotek Sentosa', 'Jl. Sentosa No. 4, Medan', ''),
('5/21/2024\r\n', 'GUD005\r\n', 'Apotek Jaya', 'Jl. Jaya No. 5, Semarang', ''),
('5/21/2024\r\n', 'GUD006\r\n', 'Apotek Baru', 'Jl. Baru No. 6, Yogyakarta', ''),
('5/21/2024\r\n', 'GUD007\r\n', 'Apotek Maju', 'Jl. Maju No. 7, Makassar', ''),
('5/21/2024\r\n', 'GUD008\r\n', 'Apotek Abadi', 'Jl. Abadi No. 8, Palembang', ''),
('5/21/2024\r\n', 'GUD009\r\n', 'Apotek Jujur', 'Jl. Jujur No. 9, Bali', ''),
('5/21/2024\r\n', 'GUD010\r\n', 'Apotek Makmur', 'Jl. Makmur No. 10, Manado', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

--
-- Dumping data untuk tabel `tb_kategori`
--

INSERT INTO `tb_kategori` (`kode_kategori`, `nama_kategori`) VALUES
('ANM01\r\n', 'Anthelmintics\r\n'),
('ATB01\r\n', 'Antibiotics\r\n'),
('INF01\r\n', 'Antifungals\r\n'),
('AAH01\r\n', 'Antihistamines & Allergy\r'),
('ANT01\r\n', 'Antivirals\r\n'),
('ANX01\r\n', 'Anxiolytics\r\n'),
('CVS01\r\n', 'Cardiovascular\r\n'),
('KAT2407001', 'Cinta'),
('CRS01\r\n', 'Cough & Respiratory Syrups\r\n'),
('DRM01\r\n', 'Dermatologicals\r\n'),
('DIA01\r\n', 'Diabetes\r\n'),
('GAS01\r\n', 'Gastrointestinal\r\n'),
('GEN01\r\n', 'General Medicines\r\n'),
('IMM02\r\n', 'Immunologicals\r\n'),
('IMM01\r\n', 'Immunosuppressants\r\n'),
('AAH02\r\n', 'Nasal Sprays\r\n'),
('KAT2407002', 'Obat Batuk'),
('PAI01\r\n', 'Pain & Inflammation\r\n'),
('CRS02\r\n', 'Respiratory Inhalers\r\n'),
('URN01\r\n', 'Urological\r\n');

--
-- Trigger `tb_kategori`
--
DELIMITER $$
CREATE TRIGGER `updateNamaKategori` AFTER UPDATE ON `tb_kategori` FOR EACH ROW BEGIN
UPDATE tb_obat SET `nama_kategori`= new.nama_kategori WHERE `kode_kategori`= new.kode_kategori;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_obat`
--

CREATE TABLE `tb_obat` (
  `tanggal` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_obat` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_obat` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `jumlah` int(11) NOT NULL,
  `satuan` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `keterangan` varchar(500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

--
-- Dumping data untuk tabel `tb_obat`
--

INSERT INTO `tb_obat` (`tanggal`, `kode_obat`, `nama_obat`, `kode_kategori`, `nama_kategori`, `jumlah`, `satuan`, `keterangan`) VALUES
('26-05-2024', 'OB2405004', 'Allegra 180mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 95, 'Tablet', 'Tablet antihistamin yang mengandung fexofenadine, digunakan untuk mengatasi alergi.\r\n'),
('26-05-2024', 'OB2405006', 'AB Phylline Capsule', 'CRS02\r\n', 'Respiratory Inhalers\r\n', 57, 'Capsule', 'Kapsul bronkodilator yang mengandung acephylline, digunakan untuk mengobati penyakit pernapasan.\r\n'),
('26-05-2024', 'OB2405007', 'Aciloc 150 Tablet', 'GAS01\r\n', 'Gastrointestinal\r\n', 61, 'Tablet', 'Tablet antagonis reseptor H2 yang mengandung ranitidine, digunakan untuk mengurangi produksi asam lambung.\r\n'),
('26-05-2024', 'OB2405008', 'Amoxyclav 625 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 89, 'Tablet', 'Tablet antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat, digunakan untuk infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405009', 'Alex Cough Lozenges Lemon Ginger', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 78, 'Lozenge', 'Permen hisap batuk yang mengandung guaifenesin, digunakan untuk meredakan batuk.\r\n'),
('26-05-2024', 'OB2405010', 'Aceclo Plus Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 68, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan aceclofenac, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n'),
('26-05-2024', 'OB2405011', 'Acemiz Plus Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 89, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan aceclofenac, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n'),
('26-05-2024', 'OB2405012', 'Aciloc RD 20 Tablet', 'GAS01\r\n', 'Gastrointestinal\r\n', 40, 'Tablet', 'Tablet liberasi terkontrol yang mengandung ranitidine, digunakan untuk mengurangi produksi asam lambung.\r\n'),
('26-05-2024', 'OB2405013', 'Augmentin DDS Suspension', 'ATB01\r\n', 'Antibiotics\r\n', 37, 'Suspension', 'Suspensi antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat.\r\n'),
('26-05-2024', 'OB2405014', 'Augmentin Duo Oral Suspension', 'ATB01\r\n', 'Antibiotics\r\n', 79, 'Suspension', 'Suspensi oral antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat.\r\n'),
('26-05-2024', 'OB2405015', 'Aldigesic P 100mg/325mg Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 5, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan ibuprofen, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n'),
('26-05-2024', 'OB2405016', 'Ascoril D Plus Syrup Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 25, 'Syrup (ml)', 'Sirup batuk yang mengandung dextromethorphan, guaifenesin, phenylephrine, dan chlorpheniramine. Bebas gula.\r\n'),
('26-05-2024', 'OB2405017', 'Aldigesic-SP Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 90, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol, diclofenac, dan serratiopeptidase, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n'),
('26-05-2024', 'OB2405018', 'Asthakind-DX Syrup Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 80, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung dextromethorphan, terbutaline, dan bromhexine. Bebas gula.\r\n'),
('26-05-2024', 'OB2405019', 'Asthakind Expectorant Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 80, 'Expectoran', 'Ekspektoran bebas gula yang mengandung bromhexine, guaifenesin, dan terbutaline, digunakan untuk meredakan batuk.\r\n'),
('26-05-2024', 'OB2405020', 'Alfoo 10mg Tablet PR', 'URN01\r\n', 'Urological\r\n', 71, 'Tablet', 'Tablet modifikasi pelepasan yang mengandung alfuzosin, digunakan untuk mengobati gejala pembesaran prostat jinak.\r\n'),
('26-05-2024', 'OB2405021', 'Anafortan 25 mg/300 mg Tablet', 'GAS01\r\n', 'Gastrointestinal\r\n', 55, 'Tablet', 'Tablet kombinasi yang mengandung dicyclomine dan paracetamol, digunakan untuk mengobati kram perut dan nyeri.\r\n'),
('26-05-2024', 'OB2405022', 'Alkasol Oral Solution', 'GEN01\r\n', 'General Medicines\r\n', 46, 'Solution (', 'Cairan oral yang mengandung disodium hydrogen citrate, digunakan untuk mengobati infeksi saluran kemih dan masalah lainnya.\r\n'),
('26-05-2024', 'OB2405023', 'Arkamin Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 5, 'Tablet', 'Tablet agonis alpha-2 adrenergik yang mengandung clonidine, digunakan untuk mengobati hipertensi.\r\n'),
('26-05-2024', 'OB2405024', 'Albendazole 400mg Tablet', 'ANM01\r\n', 'Anthelmintics\r\n', 75, 'Tablet', 'Tablet antelmintik yang digunakan untuk mengatasi infeksi cacing.\r\n'),
('26-05-2024', 'OB2405025', 'Asthakind-LS Expectorant Cola Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 90, 'Expectoran', 'Ekspektoran batuk bebas gula yang mengandung bromhexine, guaifenesin, dan terbutaline, dengan rasa cola.\r\n'),
('26-05-2024', 'OB2405026', 'Aldactone Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 97, 'Tablet', 'Tablet antagonis aldosteron yang mengandung spironolactone, digunakan untuk mengobati tekanan darah tinggi dan kondisi lainnya.\r\n'),
('26-05-2024', 'OB2405027', 'Alex Junior Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 68, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang dikhususkan untuk anak-anak, mengandung guaifenesin, terbutaline, dan bromhexine.\r\n'),
('26-05-2024', 'OB2405028', 'Almox 500 Capsule', 'ATB01\r\n', 'Antibiotics\r\n', 79, 'Capsule', 'Kapsul antibiotik yang mengandung amoksisilin, digunakan untuk mengobati infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405029', 'Allegra-M Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 18, 'Tablet', 'Tablet antihistamin yang mengandung fexofenadine dan montelukast, digunakan untuk alergi.\r\n'),
('26-05-2024', 'OB2405030', 'Alprax 0.25 Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 64, 'Tablet', 'Tablet anksiolitik yang mengandung alprazolam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n'),
('26-05-2024', 'OB2405031', 'Alprax 0.5mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 37, 'Tablet', 'Tablet anksiolitik yang mengandung alprazolam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n'),
('26-05-2024', 'OB2405032', 'Ascoril LS Drops', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 85, 'Drops (ml)', 'Tetes batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n'),
('26-05-2024', 'OB2405033', 'Ascoril LS Junior Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 46, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine, disesuaikan untuk anak-anak.\r\n'),
('26-05-2024', 'OB2405034', 'Ascoril LS Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 34, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutalin, dan bromhexine.\r\n'),
('26-05-2024', 'OB2405035', 'Althrocin 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 50, 'Tablet', 'Tablet antibiotik makrolida yang mengandung erythromycin, digunakan untuk mengobati infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405036', 'Alex Syrup\r\n', 'CRS01\r\n', 'Cough & Respiratory Syrups', 76, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n'),
('26-05-2024', 'OB2405037', 'Alex Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 76, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n'),
('26-05-2024', 'OB2405038', 'Amlokind-AT Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 46, 'Tablet', 'Tablet antihypertensi yang mengandung amlodipine dan atenolol, digunakan untuk mengatasi tekanan darah tinggi.\r\n'),
('26-05-2024', 'OB2405039', 'Ambrodil-S Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 5, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung terbutaline, bromhexine, dan guaifenesin.\r\n'),
('26-05-2024', 'OB2405040', 'Amoxycillin 500mg Capsule', 'ATB01\r\n', 'Antibiotics\r\n', 41, 'Capsule', 'Kapsul antibiotik yang mengandung amoksisilin, digunakan untuk mengobati infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405041', 'Amixide-H Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 26, 'Tablet', 'Tablet kombinasi antidepresan yang mengandung amitriptyline dan chlordiazepoxide, digunakan untuk mengobati depresi.\r\n'),
('26-05-2024', 'OB2405042', 'Anobliss Cream', 'DRM01\r\n', 'Dermatologicals\r\n', 82, 'Cream (g)', 'Krim topikal yang mengandung lidocaine, hydrocortisone, dan allantoin, digunakan untuk mengobati masalah kulit seperti gatal-gatal dan iritasi.\r\n'),
('26-05-2024', 'OB2405043', 'Anovate Cream', 'DRM01\r\n', 'Dermatologicals\r\n', 82, 'Cream (g)', 'Krim topikal yang mengandung beclomethasone, lidocaine, dan gentamicin, digunakan untuk mengobati masalah kulit.\r\n'),
('26-05-2024', 'OB2405045', 'Asthalin Respules', 'CRS02\r\n', 'Respiratory Inhalers\r\n', 92, 'Respule', 'Respule bronkodilator yang mengandung salbutamol, digunakan untuk meredakan gejala asma dan penyakit paru obstruktif kronis.\r\n'),
('26-05-2024', 'OB2405046', 'Allegra Suspension Raspberry & Vanilla', 'AAH01\r\n', 'Antihistamines & Allergy\r', 52, 'Suspension', 'Suspensi antihistamin yang mengandung fexofenadine, digunakan untuk mengatasi alergi.\r\n'),
('26-05-2024', 'OB2405047', 'Asthalin Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 16, 'Syrup (ml)', 'Sirup bronkodilator yang mengandung salbutamol, digunakan untuk mengatasi gejala asma dan penyakit paru obstruktif kronis.\r\n'),
('26-05-2024', 'OB2405048', 'Atarax 10mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 23, 'Tablet', 'Tablet antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n'),
('26-05-2024', 'OB2405049', 'Ativan 1mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 42, 'Tablet', 'Tablet anksiolitik yang mengandung lorazepam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n'),
('26-05-2024', 'OB2405050', 'Atarax 25mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 16, 'Tablet', 'Tablet antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n'),
('26-05-2024', 'OB2405051', 'Ativan 2mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 51, 'Tablet', 'Tablet anksiolitik yang mengandung lorazepam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n'),
('26-05-2024', 'OB2405052', 'Altraday Capsule SR', 'PAI01\r\n', 'Pain & Inflammation\r\n', 28, 'Capsule', 'Kapsul retard yang mengandung paracetamol, chlorpheniramine, dan phenylephrine, digunakan untuk meredakan demam, nyeri, dan gejala pilek.\r\n'),
('26-05-2024', 'OB2405053', 'Atorva Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 98, 'Tablet', 'Tablet statin yang mengandung atorvastatin, digunakan untuk mengurangi kadar kolesterol.\r\n'),
('26-05-2024', 'OB2405054', 'Atarax Syrup', 'AAH01\r\n', 'Antihistamines & Allergy\r', 67, 'Syrup (ml)', 'Sirup antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n'),
('26-05-2024', 'OB2405055', 'Avil 25 Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 92, 'Tablet', 'Tablet antihistamin generasi pertama yang mengandung pheniramine, digunakan untuk alergi dan gatal-gatal.\r\n'),
('26-05-2024', 'OB2405056', 'Avil Injection', 'AAH01\r\n', 'Antihistamines & Allergy\r', 20, 'Injection ', 'Suntikan antihistamin generasi pertama yang mengandung pheniramine, digunakan untuk alergi dan gatal-gatal.\r\n'),
('26-05-2024', 'OB2405057', 'Avomine Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r', 86, 'Tablet', 'Tablet antihistamin yang mengandung promethazine, digunakan untuk mencegah mabuk perjalanan.\r\n'),
('26-05-2024', 'OB2405058', 'Axcer 90mg Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 1, 'Tablet', 'Tablet antikoagulan yang mengandung aspirin, digunakan untuk mencegah pembekuan darah.\r\n'),
('26-05-2024', 'OB2405059', 'Azee 200mg Dry Syrup', 'ATB01\r\n', 'Antibiotics\r\n', 86, 'Dry Syrup ', 'Serbuk kering antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405060', 'Azithral 200 Liquid', 'ATB01\r\n', 'Antibiotics\r\n', 6, 'Liquid (ml', 'Cairan antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405061', 'Azithral 500 Tablet', 'ATB01\r\n', 'Antibiotics', 91, 'Tablet', 'Tablet antibiotik azalide yang digunakan untuk mengobati infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405062', 'Azee 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 93, 'Tablet', 'Tablet antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405063', 'Azicip 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 57, 'Tablet', 'Tablet antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n'),
('26-05-2024', 'OB2405064', 'Azmarda 50mg Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 40, 'Tablet', 'Tablet antikoagulan yang mengandung aspirin, digunakan untuk mencegah pembekuan darah.\r\n');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_obat_keluar`
--

CREATE TABLE `tb_obat_keluar` (
  `tanggal` varchar(100) NOT NULL,
  `id_obatKeluar` varchar(100) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(250) NOT NULL,
  `gudang` varchar(250) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `keterangan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tb_obat_keluar`
--

INSERT INTO `tb_obat_keluar` (`tanggal`, `id_obatKeluar`, `kode_obat`, `nama_obat`, `gudang`, `jumlah`, `keterangan`) VALUES
('2024-05-04', 'IN2405001', 'OB2404002', 'GIngseng Api Api', 'Damindo Utama Abadi Jaya jaya', 11, ''),
('2024-05-04', 'OUT2405001', 'OB2404002', 'GIngseng Api Api', 'CIPANAS PUNCAK', 40, ''),
('08-07-2024', 'OUT2407001', 'OB2405004', 'Allegra 180mg Tablet', 'Apotek Sehat', 10, '');

--
-- Trigger `tb_obat_keluar`
--
DELIMITER $$
CREATE TRIGGER `penguranganJumlah` AFTER INSERT ON `tb_obat_keluar` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah - new.jumlah WHERE `kode_obat`= new.kode_obat;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `returatauhapus` AFTER DELETE ON `tb_obat_keluar` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah + OLD.jumlah WHERE `kode_obat`= OLD.kode_obat;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_obat_masuk`
--

CREATE TABLE `tb_obat_masuk` (
  `tanggal` varchar(100) NOT NULL,
  `id_obatMasuk` varchar(100) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `supplier` varchar(250) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `keterangan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tb_obat_masuk`
--

INSERT INTO `tb_obat_masuk` (`tanggal`, `id_obatMasuk`, `kode_obat`, `nama_obat`, `supplier`, `jumlah`, `keterangan`) VALUES
('2024-05-04', 'IN2405001', 'OB2404002', 'GIngseng Api Api', 'Apotek Cahaya Mugni Abadi', 9, ''),
('2024-07-08', 'IN2407001', 'OB2405004', 'Allegra 180mg Tablet', 'Damindo Utama Abadi Jaya jaya', 10, '');

--
-- Trigger `tb_obat_masuk`
--
DELIMITER $$
CREATE TRIGGER `nambahinstokObat` AFTER INSERT ON `tb_obat_masuk` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah + new.jumlah WHERE `kode_obat`= new.kode_obat;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `nguranginStokObat` AFTER DELETE ON `tb_obat_masuk` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah - OLD.jumlah WHERE `kode_obat`= OLD.kode_obat;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `tanggal` varchar(100) NOT NULL,
  `kode_supplier` varchar(100) NOT NULL,
  `nama_supplier` varchar(250) NOT NULL,
  `notelpon_supplier` varchar(20) NOT NULL,
  `alamat_supplier` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tb_supplier`
--

INSERT INTO `tb_supplier` (`tanggal`, `kode_supplier`, `nama_supplier`, `notelpon_supplier`, `alamat_supplier`) VALUES
('01-05-2019', 'DU01TGLS', 'Damindo Utama Abadi Jaya jaya', '021-22685616', 'Jln. Taman Sari, Asam Reges, Jakarta'),
('5/21/2024\r\n', 'SUP001\r\n', 'PT. Pharmalab', '0812-3456-7890', 'Jl. Industri No. 123, Jakarta'),
('5/21/2024\r\n', 'SUP002\r\n', 'CV. Medline\r\n', '0856-7890-1234', 'Jl. Kesehatan No. 45, Surabaya\r\n'),
('5/21/2024\r\n', 'SUP003\r\n', 'UD. Farmasi Sejahtera\r\n', '0821-2345-6789', 'Jl. Sehat No. 67, Bandung\r\n'),
('5/21/2024\r\n', 'SUP004\r\n', 'PT. Farma Jaya\r\n', '0899-5678-1234', 'Jl. Terang No. 89, Yogyakarta\r\n'),
('5/21/2024\r\n', 'SUP005\r\n', 'CV. Pharma Bersama\r\n', '0813-4567-8901', 'Jl. Bersama No. 12, Semarang\r\n'),
('5/21/2024\r\n', 'SUP006\r\n', 'UD. Sentosa\r\n', '0857-8901-2345', 'Jl. Makmur No. 34, Medan\r\n'),
('5/21/2024\r\n', 'SUP007\r\n', 'PT. Sehat Mulia\r\n', '0896-1234-5678', 'Jl. Bahagia No. 56, Palembang\r\n'),
('5/21/2024\r\n', 'SUP008\r\n', 'CV. Pharma Sukses\r\n', '0822-3456-7890', 'Jl. Sukses No. 78, Makassar\r\n'),
('5/21/2024\r\n', 'SUP009\r\n', 'UD. Terang Jaya\r\n', '0878-9012-3456', 'Jl. Jaya No. 90, Malang\r\n'),
('5/21/2024\r\n', 'SUP010\r\n', 'PT. Bersama Sehat\r\n', '0814-5678-9012', 'Jl. Sejahtera No. 23, Batam\r\n'),
('28-04-2024', 'SUP2404001', 'Apotek Cahaya Mugni Abadi', '082214680422', 'Jl. Raya Klapanunggal'),
('07-07-2024', 'SUP2407001', 'PT Sejahtera abadi', '082562452415', 'Depok '),
('08-07-2024', 'SUP2407002', 'PT Alim Rugi Parma', '081445123454657', 'Jl. Nangka Depok'),
('08-07-2024', 'SUP2407003', 'unindra', '05345452', 'ghfthth');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`id`, `Nama`, `username`, `password`, `level`) VALUES
(1, 'Seorang Admin', 'admin', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_gudang`
--
ALTER TABLE `tb_gudang`
  ADD PRIMARY KEY (`kode_gudang`);

--
-- Indeks untuk tabel `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`kode_kategori`),
  ADD KEY `nama_kategori` (`nama_kategori`);

--
-- Indeks untuk tabel `tb_obat`
--
ALTER TABLE `tb_obat`
  ADD PRIMARY KEY (`kode_obat`),
  ADD KEY `kode_kategori` (`kode_kategori`),
  ADD KEY `nama_kategori` (`nama_kategori`),
  ADD KEY `jumlah` (`jumlah`);

--
-- Indeks untuk tabel `tb_obat_keluar`
--
ALTER TABLE `tb_obat_keluar`
  ADD PRIMARY KEY (`id_obatKeluar`);

--
-- Indeks untuk tabel `tb_obat_masuk`
--
ALTER TABLE `tb_obat_masuk`
  ADD PRIMARY KEY (`id_obatMasuk`);

--
-- Indeks untuk tabel `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
