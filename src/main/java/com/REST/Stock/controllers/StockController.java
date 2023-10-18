package com.REST.Stock.controllers;


import com.REST.Stock.models.Stock;
import com.REST.Stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    private final StockService service;

    @Autowired
    public StockController(StockService service) {
        this.service = service;
    }

    @GetMapping
    public List<Stock> getAll() {
        return service.findAll();
    }

    @PostMapping()
    public void save(@RequestBody Stock stock) {

        service.save(stock);

    }

    @PostMapping("/{id}")
    public void update(@RequestBody Stock stock, @PathVariable int id) {
        service.update(stock, id);
    }
/*
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }*/


}
