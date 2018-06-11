CREATE TABLE OrderForm(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    productId INT NOT NULL,
    purchaseCount INT NOT NULL DEFAULT '1',
    orderPrice DOUBLE,
    orderStatus VARCHAR(20),
    createTime VARCHAR(40),
    finishTime VARCHAR(40),
    payTime VARCHAR(40),
    withdrawTime varchar(40),
    userId INT NOT NULL
    ) engine=InnoDB DEFAULT CHARSET = utf8;