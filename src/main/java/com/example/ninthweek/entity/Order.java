package com.example.ninthweek.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double orderPrice;
    private double orderStatus;
    private String createTime;
    private String finishTime;
    private String payTime;
    private String withdrawTime;
    private Long userId;

    @OneToMany(mappedBy = "orders")
    private ExpressOrder expressOrder;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "orders")
    private List<OrderForm> purchaseItemList = new ArrayList<OrderForm>();
}
