CREATE SCHEMA `resort` ;
CREATE TABLE `resort`.`resort_info` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `checkedintime` DATE NOT NULL,
  `checkedouttime` DATE NOT NULL,
  `createby` VARCHAR(45) NOT NULL,
  `createdate` DATE NOT NULL,
  `updatedate` DATE NOT NULL,
  `owner` VARCHAR(45) NOT NULL,
  `priceperday` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));