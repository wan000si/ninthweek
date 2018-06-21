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

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "productId",insertable = false,updatable = false)
    private Product product;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "orderId")
    private Order order;

    public OrderForm() {
    }

    public OrderForm(Long productId, Integer purchaseCount) {
        this.productId = productId;
        this.purchaseCount = purchaseCount;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
