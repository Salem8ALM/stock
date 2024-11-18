package com.example.Account.bo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AccountResponse {
private List<Stock> stocks;



    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }



}
