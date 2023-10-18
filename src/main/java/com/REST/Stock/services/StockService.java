package com.REST.Stock.services;

import com.REST.Stock.models.Stock;
import com.REST.Stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class StockService {
    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Transactional
    public void save(Stock stock) {
        stockRepository.save(stock);
    }

    @Transactional
    public void update(Stock stock, int id) {
        stockRepository.save(stock);
    }


}
