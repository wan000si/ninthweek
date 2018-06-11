package com.example.ninthweek.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderform")
public class OrderForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private Integer purchaseCount;
    private double orderPrice;
    private double orderStatus;
    private String createTime;
    private String finishTime;
    private String payTime;
    private String withdrawTime;
    private Long userId;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "productId",insertable = false,updatable = false)
    private Product product;

    public OrderForm() {
    }

    public OrderForm(Long productId, Integer purchaseCount) {
        this.productId = productId;
        this.purchaseCount = purchaseCount;
    }

    public OrderForm(double orderPrice, double orderStatus, String createTime, String finishTime, String payTime, String withdrawTime, Long userId) {
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.finishTime = finishTime;
        this.payTime = payTime;
        this.withdrawTime = withdrawTime;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(double orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(String withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
