package com.sebi.deliver.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Cart Request", description = "Cart request")
public class CartRequest {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer quantity;

    public CartRequest() {
    }

    public CartRequest(Long id, Long userId, Long productId, Integer quantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
