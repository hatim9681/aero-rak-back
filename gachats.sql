-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2023 at 04:35 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gachats`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorie`
--

CREATE TABLE `categorie` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorie`
--

INSERT INTO `categorie` (`id`, `name`) VALUES
(1, 'Fonctionnement'),
(2, 'Maintenance (MAD)'),
(3, 'Maintenance (Devise)');

-- --------------------------------------------------------

--
-- Table structure for table `facture`
--

CREATE TABLE `facture` (
  `id` int(11) NOT NULL,
  `date_arrive` date DEFAULT NULL,
  `date_fac` date DEFAULT NULL,
  `fournisseur` varchar(255) DEFAULT NULL,
  `montant_ttc` double NOT NULL,
  `nature` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `periode_debut` date DEFAULT NULL,
  `periode_fin` date DEFAULT NULL,
  `service` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `marche_id` int(11) DEFAULT NULL,
  `prestataire_id` int(11) DEFAULT NULL,
  `observation` varchar(255) DEFAULT NULL,
  `date_reception` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `facture`
--

INSERT INTO `facture` (`id`, `date_arrive`, `date_fac`, `fournisseur`, `montant_ttc`, `nature`, `numero`, `periode_debut`, `periode_fin`, `service`, `status`, `marche_id`, `prestataire_id`, `observation`, `date_reception`) VALUES
(117, '2023-12-07', '2023-12-06', NULL, 988, 'Marché', 'aaa', '2023-12-07', '2023-12-06', 'Produit', b'1', 129, NULL, '', '2023-11-27'),
(119, '2023-12-12', '2023-12-06', 'RADEEMA', 55, 'Electricité', 'qfdsf', NULL, NULL, 'Electricité', b'1', NULL, 42, '', '2023-12-04'),
(122, NULL, NULL, 'RADEEMA', 0, 'Electricité', '', NULL, NULL, 'Electricité', b'1', NULL, 42, '', '2023-08-16'),
(123, NULL, NULL, NULL, 0, 'Marché', '', NULL, NULL, 'Produit', b'1', 129, NULL, '', '2023-08-16'),
(124, '2023-12-05', '2023-12-07', NULL, 900, 'Marché', 'aaa', NULL, NULL, 'Produit', b'1', 130, NULL, '', '2023-11-03'),
(125, NULL, NULL, NULL, 0, 'Marché', '', NULL, NULL, 'Produit', b'1', 130, NULL, '', '2023-11-02'),
(126, NULL, NULL, 'RADEEMA', 0, 'Electricité', '', NULL, NULL, 'Electricité', b'1', NULL, 42, '', '2023-12-01'),
(127, NULL, NULL, NULL, 0, 'Marché', '', NULL, NULL, 'Produit', b'1', 129, NULL, '', '2023-11-30'),
(128, NULL, NULL, NULL, 0, 'Marché', '', NULL, NULL, 'Produit', b'1', 129, NULL, '', '2023-11-15'),
(129, NULL, NULL, 'RADEEMA', 0, 'Electricité', '', NULL, NULL, 'Electricité', b'0', NULL, 42, '', '2023-12-15'),
(130, NULL, NULL, 'ONEE', 0, 'Electricité', '', NULL, NULL, 'Electricité', b'0', NULL, 43, '', '2023-12-15'),
(131, NULL, NULL, 'ONEE', 0, 'Electricité', '', NULL, NULL, 'Electricité', b'1', NULL, 43, '', '2023-12-06'),
(132, NULL, NULL, 'eee', 0, 'Marché', '', NULL, NULL, 'Produit', b'0', 144, NULL, '', '2023-12-14'),
(138, '2023-12-05', '2023-12-05', 'RADEEMA', 5.5, 'Electricité', 'qsdsd', '2023-12-07', '2023-12-13', 'Electricité', b'0', NULL, 42, '', '2023-12-01'),
(139, '2023-12-11', '2023-12-06', 'RADEEMA', 5.5, 'Electricité', 'dsd', '2023-12-13', '2023-12-13', 'Electricité', b'0', NULL, 42, '', '2023-12-08');

-- --------------------------------------------------------

--
-- Table structure for table `marche`
--

CREATE TABLE `marche` (
  `id` int(11) NOT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `montant_ttc` double NOT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `categorie_id` int(11) DEFAULT NULL,
  `fournisseur` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `prestation` varchar(255) DEFAULT NULL,
  `observation` varchar(255) DEFAULT NULL,
  `attribution` varchar(255) DEFAULT NULL,
  `date_os_arret` date DEFAULT NULL,
  `date_os_aug` date DEFAULT NULL,
  `date_os_debut` date DEFAULT NULL,
  `date_os_reprise` date DEFAULT NULL,
  `main_levee` varchar(255) DEFAULT NULL,
  `mt_caution_def` double NOT NULL,
  `num_act_eng` varchar(255) DEFAULT NULL,
  `num_caution_def` varchar(255) DEFAULT NULL,
  `pv_reception` varchar(255) DEFAULT NULL,
  `ref_notif` varchar(255) DEFAULT NULL,
  `ref_os_arret` varchar(255) DEFAULT NULL,
  `ref_os_aug` varchar(255) DEFAULT NULL,
  `ref_os_debut` varchar(255) DEFAULT NULL,
  `ref_os_reprise` varchar(255) DEFAULT NULL,
  `site_paiement` varchar(255) DEFAULT NULL,
  `tva` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marche`
--

INSERT INTO `marche` (`id`, `date_debut`, `date_fin`, `montant_ttc`, `numero`, `status`, `categorie_id`, `fournisseur`, `description`, `prestation`, `observation`, `attribution`, `date_os_arret`, `date_os_aug`, `date_os_debut`, `date_os_reprise`, `main_levee`, `mt_caution_def`, `num_act_eng`, `num_caution_def`, `pv_reception`, `ref_notif`, `ref_os_arret`, `ref_os_aug`, `ref_os_debut`, `ref_os_reprise`, `site_paiement`, `tva`) VALUES
(127, '2023-09-12', '2023-11-03', 88, 'fg584', b'0', 3, 'societe y', NULL, 'le management des systemes informatique due a la coperation', '', 'dsfqsd', NULL, NULL, NULL, NULL, '', 0, '', '', '', 'dsf', '', '', '', '', 'sfq', 10),
(129, '2023-10-01', '2023-12-28', 664072.56, '109/23', b'1', 1, 'dsdsr', NULL, 'prestation medicales aux unités medicales d\'urgences (UMU) dans les differences aeroports du Maroc. Lot n°2 : Aéroport Marrakech', '', 'division operations et experience passagers', NULL, NULL, '2023-10-01', NULL, '', 0, 'ddd', 'a revoir', '', '', '', '', '09MA/SAF/DS/OS/23', '', 'Marrakech', 0),
(130, '2023-08-15', '2023-12-02', 80000, 'f8759', b'0', 1, 'qqqqqq', NULL, 'l\'amelioration des equipements', '', 'mr hadi', NULL, NULL, '2023-12-27', NULL, '', 20000, '', 'r845', '', 'non', '', '', '2023-12-06', '1919', 'casa', 20),
(144, '2023-12-06', '2023-12-25', 100, 'azaz', b'0', 3, 'eee', NULL, 'ssss', '', 'dddd', NULL, NULL, NULL, NULL, '', 0, '', '', '', '', '', '', '', '', '', 1),
(154, '2023-12-05', '2023-12-17', 4.5, 'sdsd', b'0', 3, 'dsds', NULL, 'dsd', '', 'dsd', NULL, NULL, NULL, NULL, '', 0, '', '', '', '', '', '', '', '', '', 4);

-- --------------------------------------------------------

--
-- Table structure for table `payement`
--

CREATE TABLE `payement` (
  `id` int(11) NOT NULL,
  `asf` varchar(255) DEFAULT NULL,
  `banque` varchar(255) DEFAULT NULL,
  `cnss` varchar(255) DEFAULT NULL,
  `decomptes` varchar(255) DEFAULT NULL,
  `penalites` varchar(255) DEFAULT NULL,
  `rapport` varchar(255) DEFAULT NULL,
  `rib` varchar(255) DEFAULT NULL,
  `slo` varchar(255) DEFAULT NULL,
  `marche_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payement`
--

INSERT INTO `payement` (`id`, `asf`, `banque`, `cnss`, `decomptes`, `penalites`, `rapport`, `rib`, `slo`, `marche_id`) VALUES
(13, '488', 'cih', '58', '', '', '', '58741236658954', '', 129),
(14, '586', 'cih', 'f4785', '', 'non', '', '8796547853', '', 130);

-- --------------------------------------------------------

--
-- Table structure for table `prestataire`
--

CREATE TABLE `prestataire` (
  `id` int(11) NOT NULL,
  `commentaire` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `service` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prestataire`
--

INSERT INTO `prestataire` (`id`, `commentaire`, `nom`, `service`) VALUES
(42, 'A fairea', 'RADEEMA', 'Electricité'),
(43, 'Quartier', 'ONEE', 'Electricité'),
(44, 'Test', 'ONEP', 'Eau'),
(45, '100M/S', 'MAROC TELECOM', 'Internet'),
(46, '06', 'Orange', 'Internet');

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `date_naissance` date DEFAULT NULL,
  `motde_passe` varchar(255) DEFAULT NULL,
  `nom_complet` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `date_naissance`, `motde_passe`, `nom_complet`, `role`, `telephone`, `email`) VALUES
(40, '1900-01-01', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 'Administrateur', 'Admin', '123', 'admin@admin.com'),
(41, '2023-12-01', '04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb', 'Utilisateur', 'Opérateur', '123', 'user@user.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8fw98pwtw1c3i1m5r0x3nq4kf` (`marche_id`),
  ADD KEY `FK2yvqyc1kp65yjt6n63yllxxgl` (`prestataire_id`);

--
-- Indexes for table `marche`
--
ALTER TABLE `marche`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKciguw28i8ypit0rvog5cm0h74` (`categorie_id`);

--
-- Indexes for table `payement`
--
ALTER TABLE `payement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfikrjwfyxnhxdou13s5ks8o6j` (`marche_id`);

--
-- Indexes for table `prestataire`
--
ALTER TABLE `prestataire`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `facture`
--
ALTER TABLE `facture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140;

--
-- AUTO_INCREMENT for table `marche`
--
ALTER TABLE `marche`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=155;

--
-- AUTO_INCREMENT for table `payement`
--
ALTER TABLE `payement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `prestataire`
--
ALTER TABLE `prestataire`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `FK2yvqyc1kp65yjt6n63yllxxgl` FOREIGN KEY (`prestataire_id`) REFERENCES `prestataire` (`id`),
  ADD CONSTRAINT `FK8fw98pwtw1c3i1m5r0x3nq4kf` FOREIGN KEY (`marche_id`) REFERENCES `marche` (`id`);

--
-- Constraints for table `marche`
--
ALTER TABLE `marche`
  ADD CONSTRAINT `FKciguw28i8ypit0rvog5cm0h74` FOREIGN KEY (`categorie_id`) REFERENCES `categorie` (`id`);

--
-- Constraints for table `payement`
--
ALTER TABLE `payement`
  ADD CONSTRAINT `FKfikrjwfyxnhxdou13s5ks8o6j` FOREIGN KEY (`marche_id`) REFERENCES `marche` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
