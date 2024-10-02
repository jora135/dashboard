package com.dashboard.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dashboard.entity.Trade;
import com.dashboard.dashboard.repository.TradeRepository;

@Service
public class TradeService {
    @Autowired
    TradeRepository tradeRepository;

    // buscar todos los elementos y retornarlos de la BD
    public List<Trade> getTrade(){
        return tradeRepository.findAll();
    }

    // buscar por traderId y retornarlos de la BD
    public Optional<Trade> getTrade(Long id){
        return tradeRepository.findById(id);
    }

    //guardar y actualizar en un solo metodo
    public void saveOrUpdate(Trade trade){
        tradeRepository.save(trade);
    }

    //eliminar en un solo metodo
    public void delete(Long id){
        tradeRepository.deleteById(id);
    }

}
