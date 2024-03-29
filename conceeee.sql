-- MySQL Script generated by MySQL Workbench
-- Mon Mar 11 17:15:43 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`salespeople`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`salespeople` (
  `id_sales` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_sales`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`concert`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`concert` (
  `id_concert` INT NOT NULL AUTO_INCREMENT,
  `nazvanie` VARCHAR(45) NOT NULL,
  `genre` VARCHAR(45) NOT NULL,
  `data` DATE NOT NULL,
  `place` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_concert`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`customers` (
  `id_cust` INT NOT NULL AUTO_INCREMENT,
  `namee` VARCHAR(45) NOT NULL,
  `logine` VARCHAR(45) NOT NULL,
  `passworde` VARCHAR(45) NOT NULL,
  `cust_code` VARCHAR(45) NOT NULL,
  `id_conce` INT NOT NULL,
  PRIMARY KEY (`id_cust`),
  INDEX `id_conce_idx` (`id_conce` ASC) VISIBLE,
  CONSTRAINT `id_conce`
    FOREIGN KEY (`id_conce`)
    REFERENCES `mydb`.`concert` (`id_concert`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ticket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ticket` (
  `id_ticket` INT NOT NULL AUTO_INCREMENT,
  `id_concerta` INT NOT NULL,
  `cost` VARCHAR(45) NOT NULL,
  `seat` VARCHAR(45) NOT NULL,
  `id_sale` INT NOT NULL,
  PRIMARY KEY (`id_ticket`),
  INDEX `id_concerta_idx` (`id_concerta` ASC) VISIBLE,
  INDEX `id_sale_idx` (`id_sale` ASC) VISIBLE,
  CONSTRAINT `id_concerta`
    FOREIGN KEY (`id_concerta`)
    REFERENCES `mydb`.`concert` (`id_concert`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_sale`
    FOREIGN KEY (`id_sale`)
    REFERENCES `mydb`.`salespeople` (`id_sales`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
