-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 05, 2025 alle 17:05
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bilancio`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `bilancio`
--

CREATE TABLE `bilancio` (
  `id` int(11) NOT NULL,
  `descrizione` varchar(255) NOT NULL,
  `ricezione` datetime NOT NULL,
  `importo_entrata` int(11) DEFAULT NULL,
  `importo_uscita` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `bilancio`
--

INSERT INTO `bilancio` (`id`, `descrizione`, `ricezione`, `importo_entrata`, `importo_uscita`) VALUES
(1, 'Stipendio mensile', '2025-05-01 09:00:00', 2000, NULL),
(3, 'Affitto casa', '2025-05-02 08:00:00', NULL, 800),
(4, 'Pagamento cliente', '2025-05-03 10:30:00', 1500, NULL),
(5, 'Spesa supermercato', '2025-05-04 17:15:00', NULL, 120),
(6, 'Vendita oggetto usato', '2025-05-05 12:00:00', 300, NULL),
(7, 'Bollette luce e gas', '2025-05-06 11:00:00', NULL, 250),
(8, 'Rimborso assicurazione', '2025-05-07 09:45:00', 400, NULL),
(9, 'Acquisto mobili', '2025-05-08 14:20:00', NULL, 900),
(10, 'Donazione ricevuta', '2025-05-09 16:00:00', 100, NULL),
(11, 'Cena al ristorante', '2025-05-10 20:00:00', NULL, 60);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `bilancio`
--
ALTER TABLE `bilancio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `bilancio`
--
ALTER TABLE `bilancio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
