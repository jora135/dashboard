package com.dashboard.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.dashboard.entity.Trade;
import com.dashboard.dashboard.service.TradeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "api/v1/trade")
public class TradeController {
    
    @Autowired
    private TradeService tradeService;

    @GetMapping()
    public List<Trade> getAll(){
        return tradeService.getTrade();
    } 

    @GetMapping("/{traderId}")
    public Optional<Trade> getById(@PathVariable("traderId") Long traderId) {
        return tradeService.getTrade(traderId);
    } 

    @PostMapping
    public Trade saveOrUpdate(@RequestBody Trade trade){
        tradeService.saveOrUpdate(trade);
        return trade;
    }

    @DeleteMapping("/{traderId}")
    public void deleteById(@PathVariable("traderId") Long traderId){
        tradeService.delete(traderId);
    }
}
