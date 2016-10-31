SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `salondatabase` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `salondatabase` ;

-- -----------------------------------------------------
-- Table `salondatabase`.`Client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Client` (
  `Client_ID` INT NOT NULL AUTO_INCREMENT,
  `First_Name` VARCHAR(45) NOT NULL,
  `Last_Name` VARCHAR(45) NOT NULL,
  `Contact_Number` VARCHAR(11) NOT NULL,
  `First_In_Date` DATE NOT NULL,
  PRIMARY KEY (`Client_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Service` (
  `Service_ID` INT NOT NULL AUTO_INCREMENT,
  `Service_Name` VARCHAR(45) NOT NULL,
  `Duration` INT NOT NULL,
  `Service_Price` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`Service_ID`),
  UNIQUE INDEX `Service_Name_UNIQUE` (`Service_Name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Employee` (
  `Employee_ID` VARCHAR(11) NOT NULL,
  `First_Name` VARCHAR(45) NULL,
  `Last_Name` VARCHAR(45) NULL,
  `Contact_Number` VARCHAR(11) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `City` VARCHAR(45) NOT NULL,
  `Basic_Salary` DECIMAL(10,2) NOT NULL,
  `Profile_Picture` BLOB NULL,
  PRIMARY KEY (`Employee_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Appointment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Appointment` (
  `Appointment_ID` INT NOT NULL AUTO_INCREMENT,
  `Date` DATE NOT NULL,
  `Start_Time` TIME NOT NULL,
  `End_Time` TIME NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `Client_Client_ID` INT NOT NULL,
  PRIMARY KEY (`Appointment_ID`, `Client_Client_ID`),
  INDEX `fk_Appointment_Client_idx` (`Client_Client_ID` ASC),
  CONSTRAINT `fk_Appointment_Client`
    FOREIGN KEY (`Client_Client_ID`)
    REFERENCES `salondatabase`.`Client` (`Client_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Appointment_has_Service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Appointment_has_Service` (
  `Appointment_Appointment_ID` INT NULL,
  `Appointment_Client_Client_ID` INT NULL,
  `Service_Service_ID` INT NULL,
  INDEX `fk_Appointment_has_Service_Service1_idx` (`Service_Service_ID` ASC),
  CONSTRAINT `fk_Appointment_has_Service_Appointment1`
    FOREIGN KEY (`Appointment_Appointment_ID`)
    REFERENCES `salondatabase`.`Appointment` (`Appointment_ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Appointment_has_Service_Service1`
    FOREIGN KEY (`Service_Service_ID`)
    REFERENCES `salondatabase`.`Service` (`Service_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Supplier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Supplier` (
  `Supplier_ID` VARCHAR(11) NOT NULL,
  `First_Name` VARCHAR(45) NOT NULL,
  `Last_Name` VARCHAR(45) NOT NULL,
  `Company_Name` VARCHAR(45) NOT NULL,
  `Contact_Number` VARCHAR(11) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `City` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Supplier_ID`),
  UNIQUE INDEX `Company_Name_UNIQUE` (`Company_Name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Stock`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Stock` (
  `Stock_ID` INT NOT NULL AUTO_INCREMENT,
  `Stock_Name` VARCHAR(45) NOT NULL,
  `Selling_Price` DECIMAL(10,2) NOT NULL,
  `Stock_Level` INT NOT NULL DEFAULT 0,
  `Reorder_Level` INT NOT NULL,
  `Supplier_Supplier_ID` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`Stock_ID`, `Stock_Name`, `Supplier_Supplier_ID`),
  INDEX `fk_Stock_Supplier1_idx` (`Supplier_Supplier_ID` ASC),
  CONSTRAINT `fk_Stock_Supplier1`
    FOREIGN KEY (`Supplier_Supplier_ID`)
    REFERENCES `salondatabase`.`Supplier` (`Supplier_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`PurchaceInvoice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`PurchaceInvoice` (
  `PurchaceInvoice_ID` INT NOT NULL AUTO_INCREMENT,
  `Invoice_Date` DATE NOT NULL,
  `Due_Date` DATE NOT NULL,
  `Cost` DECIMAL(10,2) NULL,
  `Quantity` INT NOT NULL,
  `Discount` DECIMAL(10,2) NULL DEFAULT 0,
  `Total_Payment` DECIMAL(10,2) NOT NULL,
  `Invoice_Balance` DECIMAL(10,2) NOT NULL,
  `Status` VARCHAR(45) NULL DEFAULT 'Not Paid',
  `Stock_Stock_ID` INT NOT NULL,
  PRIMARY KEY (`PurchaceInvoice_ID`, `Stock_Stock_ID`),
  INDEX `fk_PurchaceInvoice_Stock1_idx` (`Stock_Stock_ID` ASC),
  CONSTRAINT `fk_PurchaceInvoice_Stock1`
    FOREIGN KEY (`Stock_Stock_ID`)
    REFERENCES `salondatabase`.`Stock` (`Stock_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`EmployeePayment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`EmployeePayment` (
  `Payment_ID` INT NOT NULL AUTO_INCREMENT,
  `Payment_Date` DATE NOT NULL,
  `Monthly_Payment` DECIMAL(10,2) NOT NULL,
  `Bonus_Payment` DECIMAL(10,2) NOT NULL,
  `Total_Payment` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`Payment_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Invoice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Invoice` (
  `Invoice_ID` INT NOT NULL AUTO_INCREMENT,
  `Invoice_Date` DATE NOT NULL,
  `Total_Price` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`Invoice_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Invoice_has_Service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Invoice_has_Service` (
  `Invoice_Invoice_ID` INT NOT NULL,
  `Service_Service_ID` INT NULL,
  INDEX `fk_Invoice_has_Service_Service1_idx` (`Service_Service_ID` ASC),
  INDEX `fk_Invoice_has_Service_Invoice1_idx` (`Invoice_Invoice_ID` ASC),
  CONSTRAINT `fk_Invoice_has_Service_Invoice1`
    FOREIGN KEY (`Invoice_Invoice_ID`)
    REFERENCES `salondatabase`.`Invoice` (`Invoice_ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Invoice_has_Service_Service1`
    FOREIGN KEY (`Service_Service_ID`)
    REFERENCES `salondatabase`.`Service` (`Service_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Invoice_has_Stock`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Invoice_has_Stock` (
  `Invoice_Invoice_ID` INT NOT NULL,
  `Stock_Stock_ID` INT NULL,
  `Quantity` INT NOT NULL,
  INDEX `fk_Invoice_has_Stock_Stock1_idx` (`Stock_Stock_ID` ASC),
  INDEX `fk_Invoice_has_Stock_Invoice1_idx` (`Invoice_Invoice_ID` ASC),
  CONSTRAINT `fk_Invoice_has_Stock_Invoice1`
    FOREIGN KEY (`Invoice_Invoice_ID`)
    REFERENCES `salondatabase`.`Invoice` (`Invoice_ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Invoice_has_Stock_Stock1`
    FOREIGN KEY (`Stock_Stock_ID`)
    REFERENCES `salondatabase`.`Stock` (`Stock_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Appointment_has_Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Appointment_has_Employee` (
  `Appointment_Appointment_ID` INT NULL,
  `Employee_Employee_ID` VARCHAR(11) NULL,
  INDEX `fk_Appointment_has_Employee_Employee1_idx` (`Employee_Employee_ID` ASC),
  INDEX `fk_Appointment_has_Employee_Appointment1_idx` (`Appointment_Appointment_ID` ASC),
  CONSTRAINT `fk_Appointment_has_Employee_Appointment1`
    FOREIGN KEY (`Appointment_Appointment_ID`)
    REFERENCES `salondatabase`.`Appointment` (`Appointment_ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Appointment_has_Employee_Employee1`
    FOREIGN KEY (`Employee_Employee_ID`)
    REFERENCES `salondatabase`.`Employee` (`Employee_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Login` (
  `User_Type` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Appointments` VARCHAR(45) NULL,
  `Services` VARCHAR(45) NULL,
  `Inventory` VARCHAR(45) NULL,
  `Sales` VARCHAR(45) NULL,
  `Employees` VARCHAR(45) NULL,
  `Finance` VARCHAR(45) NULL,
  `Reports` VARCHAR(45) NULL,
  `Administrator` VARCHAR(45) NULL,
  PRIMARY KEY (`User_Type`),
  UNIQUE INDEX `User_Type_UNIQUE` (`User_Type` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `salondatabase`.`Invoice_has_Appointment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `salondatabase`.`Invoice_has_Appointment` (
  `Invoice_Invoice_ID` INT NOT NULL,
  `Appointment_Appointment_ID` INT NULL,
  CONSTRAINT `fk_Invoice_has_Appointment_Appointment1`
    FOREIGN KEY (`Appointment_Appointment_ID`)
    REFERENCES `salondatabase`.`Appointment` (`Appointment_ID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Invoice_has_Appointment_Invoice1`
    FOREIGN KEY (`Invoice_Invoice_ID`)
    REFERENCES `salondatabase`.`Invoice` (`Invoice_ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
