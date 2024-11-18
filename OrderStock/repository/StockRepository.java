package com.example.OrderStock.repository;

import com.example.OrderStock.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, Long> {

    Iterable<StockEntity> findByItem(String item);
    //StockEntity findByItem(String item);
    List<StockEntity> findAll();
}