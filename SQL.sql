-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema lehman_hack
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lehman_hack
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lehman_hack` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `lehman_hack` ;

-- -----------------------------------------------------
-- Table `lehman_hack`.`Theraphist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Theraphist` (
  `idTheraphist` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `firstname` VARCHAR(30) NOT NULL COMMENT '',
  `lastname` VARCHAR(35) NOT NULL COMMENT '',
  `email` VARCHAR(45) NOT NULL COMMENT '',
  `phonenumber` VARCHAR(45) NOT NULL COMMENT '',
  `degree` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`idTheraphist`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lehman_hack`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`User` (
  `username` VARCHAR(15) NOT NULL COMMENT '',
  `pass` VARCHAR(30) NOT NULL COMMENT '',
  `creditcard` VARCHAR(16) NOT NULL COMMENT '',
  `status` INT NOT NULL COMMENT '',
  `Theraphist_idTheraphist` INT COMMENT '',
  PRIMARY KEY (`username`)  COMMENT '',
  INDEX `fk_User_Theraphist1_idx` (`Theraphist_idTheraphist` ASC)  COMMENT '',
  CONSTRAINT `fk_User_Theraphist1`
    FOREIGN KEY (`Theraphist_idTheraphist`)
    REFERENCES `lehman_hack`.`Theraphist` (`idTheraphist`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lehman_hack`.`Specialization`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Specialization` (
  `idSpecialization` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`idSpecialization`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lehman_hack`.`Theraphist_has_Specialization`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Theraphist_has_Specialization` (
  `Theraphist_idTheraphist` INT NOT NULL COMMENT '',
  `Specialization_idSpecialization` INT NOT NULL COMMENT '',
  PRIMARY KEY (`Theraphist_idTheraphist`, `Specialization_idSpecialization`)  COMMENT '',
  INDEX `fk_Theraphist_has_Specialization_Specialization1_idx` (`Specialization_idSpecialization` ASC)  COMMENT '',
  INDEX `fk_Theraphist_has_Specialization_Theraphist_idx` (`Theraphist_idTheraphist` ASC)  COMMENT '',
  CONSTRAINT `fk_Theraphist_has_Specialization_Theraphist`
    FOREIGN KEY (`Theraphist_idTheraphist`)
    REFERENCES `lehman_hack`.`Theraphist` (`idTheraphist`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Theraphist_has_Specialization_Specialization1`
    FOREIGN KEY (`Specialization_idSpecialization`)
    REFERENCES `lehman_hack`.`Specialization` (`idSpecialization`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `lehman_hack`.`Thread`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Thread` (
  `idThread` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `title` VARCHAR(100) NOT NULL COMMENT '',
  `post` VARCHAR(500) NOT NULL COMMENT '',
  `closed` TINYINT(1) NOT NULL COMMENT '',
  `censured` TINYINT(1) NOT NULL COMMENT '',
  `date` DATETIME NOT NULL COMMENT '',
  `User_username` VARCHAR(15) NOT NULL COMMENT '',
  
  PRIMARY KEY (`idThread`)  COMMENT '',
  INDEX `fk_Thread_User1_idx` (`User_username` ASC)  COMMENT '',
  CONSTRAINT `fk_Thread_User1`
    FOREIGN KEY (`User_username`)
    REFERENCES `lehman_hack`.`User` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `lehman_hack`.`ThreadVotes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`ThreadVotes` (
  `idVotes` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Thread_idThread` INT NOT NULL COMMENT '',
  `User_username` VARCHAR(15) NOT NULL COMMENT '',
  `type` TINYINT(1) NOT NULL COMMENT '',
  PRIMARY KEY (`idVotes`)  COMMENT '',
  INDEX `fk_Votes_User1_idx` (`User_username` ASC)  COMMENT '',
  CONSTRAINT `fk_Votes_User1`
    FOREIGN KEY (`User_username`)
    REFERENCES `lehman_hack`.`User` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Thread_idThread1`
    FOREIGN KEY (`Thread_idThread`)
    REFERENCES `lehman_hack`.`Thread` (`idThread`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `lehman_hack`.`Comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Comments` (
  `idComments` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Thread_idThread` INT NOT NULL COMMENT '',
  `Thread_User_username` VARCHAR(15) NOT NULL COMMENT '',
  `comment` VARCHAR(400) NOT NULL COMMENT '',
  `censured` TINYINT(1) NOT NULL COMMENT '',
  INDEX `fk_Comments_Thread1_idx` (`Thread_idThread` ASC)  COMMENT '',
  PRIMARY KEY (`idComments`)  COMMENT '',
  CONSTRAINT `fk_Comments_Thread1`
    FOREIGN KEY (`Thread_idThread`)
    REFERENCES `lehman_hack`.`Thread` (`idThread`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lehman_hack`.`CommentVotes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`CommentVotes` (
  `idCommentVotes` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Comment_idComment` INT NOT NULL COMMENT '',
  `User_username` VARCHAR(15) NOT NULL COMMENT '',
  `type` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idCommentVotes`)  COMMENT '',
  INDEX `fk_CommentVotes_User1_idx` (`User_username` ASC)  COMMENT '',
  CONSTRAINT `fk_CommentVotes_User1`
    FOREIGN KEY (`User_username`)
    REFERENCES `lehman_hack`.`User` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CommentVotes_Comments1`
    FOREIGN KEY (`Comment_idComment`)
    REFERENCES `lehman_hack`.`Comments` (`idComments`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `lehman_hack`.`Log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lehman_hack`.`Log` (
  `idLog` INT NOT NULL COMMENT '',
  `User_username` VARCHAR(15) NOT NULL COMMENT '',
  `type` INT NOT NULL COMMENT '',
  `date` DATETIME NOT NULL COMMENT '',
  PRIMARY KEY (`idLog`)  COMMENT '',
  INDEX `fk_Log_User1_idx` (`User_username` ASC)  COMMENT '',
  CONSTRAINT `fk_Log_User1`
    FOREIGN KEY (`User_username`)
    REFERENCES `lehman_hack`.`User` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
