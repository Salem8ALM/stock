package com.example.OrderStock.controller;

import com.example.OrderStock.bo.AccountResponse;
import com.example.OrderStock.bo.CreateStockRequest;
import com.example.OrderStock.bo.UpdateStockResponse;
import com.example.OrderStock.service.StockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }

    @GetMapping("/account")
    public AccountResponse accountResponse() {

        return stockService.getStocks();
    }


}