package com.example.OrderStock.bo;

import com.example.OrderStock.entity.StockEntity;

import java.util.List;

public class AccountResponse {
    List<StockEntity> stock;

    public AccountResponse(List<StockEntity> stock) {
        this.stock = stock;
    }

    public List<StockEntity> getStock() {
        return stock;
    }

    public void setStock(List<StockEntity> stock) {
        this.stock = stock;
    }
}
