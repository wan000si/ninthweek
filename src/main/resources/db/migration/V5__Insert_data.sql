INSERT INTO Product (name,description,price,inventoryId) VALUES ( '矿泉水1', '农夫山泉',2,1);
INSERT INTO Product (name,description,price,inventoryId) VALUES ( '矿泉水2', '康师傅',1.5,2);
INSERT INTO Product (name,description,price,inventoryId) VALUES ( '矿泉水3', '怡宝',2,3);
INSERT INTO Product (name,description,price,inventoryId) VALUES ( '矿泉水4', '爱夸',4,4);

INSERT INTO Inventory (count,lockedCount) VALUES (100,10);
INSERT INTO Inventory (count,lockedCount) VALUES (107,13);
INSERT INTO Inventory (count,lockedCount) VALUES (100,5);
INSERT INTO Inventory (count,lockedCount) VALUES (160,28);
INSERT INTO Inventory (count,lockedCount) VALUES (55,5);

INSERT INTO OrderForm (productId,purchaseCount,orderPrice,orderStatus,createTime,finishTime,payTime,withdrawTime,userId) VALUES (1,10,20,"finished","2018-5-10","2018-5-14","2018-5-11","",1);;
INSERT INTO OrderForm (productId,purchaseCount,orderPrice,orderStatus,createTime,finishTime,payTime,withdrawTime,userId) VALUES (2,25,50,"unpaid","2018-5-11","","","",1);

INSERT INTO ExpressOrder(orderId,deliveryStatus,deliveryTime,receivingTime,deliverer)VALUES (1,"readyToShip","","","阿里");