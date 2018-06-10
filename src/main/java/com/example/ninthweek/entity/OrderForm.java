package com.example.ninthweek.entity;

public class OrderForm {
    private Long id;
    private double orderPrice;
    private double orderStatus;
    private String createTime;
    private String finishTime;
    private String payTime;
    private String withdrawTime;
    private Long userId;


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
