CREATE TABLE Product(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price DOUBLE NOT NULL,
    inventoryId INT DEFAULT NULL
) engine=InnoDB DEFAULT CHARSET = utf8;