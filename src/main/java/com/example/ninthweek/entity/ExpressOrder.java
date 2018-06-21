package com.example.ninthweek.entity;

import javax.persistence.*;

@Entity
@Table(name = "expressorder")
public class ExpressOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String deliveryStatus;
    private String deliveryTime;
    private String receivingTime;
    private String deliverer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId", insertable = false, updatable = false)
    private Order order;

    public ExpressOrder() {
    }

    public ExpressOrder(Long orderId, String deliveryStatus) {
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
    }

    public ExpressOrder(String deliveryStatus, String deliveryTime, String receivingTime, String deliverer) {
        this.deliveryStatus = deliveryStatus;
        this.deliveryTime = deliveryTime;
        this.receivingTime = receivingTime;
        this.deliverer = deliverer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(String receivingTime) {
        this.receivingTime = receivingTime;
    }

    public String getDeliverer() {
        return deliverer;
    }

    public void setDeliverer(String deliverer) {
        this.deliverer = deliverer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
