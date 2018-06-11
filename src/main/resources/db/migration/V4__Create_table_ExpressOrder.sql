CREATE TABLE ExpressOrder(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    orderId INT NOT NULL,
    deliveryStatus VARCHAR(20),
    deliveryTime VARCHAR(40),
    receivingTime VARCHAR(40),
    deliverer VARCHAR(20)
) engine=InnoDB DEFAULT CHARSET = utf8;
