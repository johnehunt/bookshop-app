CREATE SCHEMA `bookshop` ;



CREATE TABLE `bookshop`.`address` (
       `id` INT NOT NULL AUTO_INCREMENT,
       `number` INT NULL,
       `street` VARCHAR(255) NOT NULL,
       `city` VARCHAR(255) NOT NULL,
       `county` VARCHAR(255) NULL,
       `postcode` VARCHAR(10) NULL,
        PRIMARY KEY (`id`));

INSERT INTO `bookshop`.`address`
(
 `number`,
 `street`,
 `city`,
 `county`,
 `postcode`)
VALUES
  (
    10,
    "The Main Street",
    <{city: }>,
    <{county: }>,
    <{postcode: }>);
