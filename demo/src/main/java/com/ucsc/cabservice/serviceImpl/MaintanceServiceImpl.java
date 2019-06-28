/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Maintance;
import com.ucsc.cabservice.repository.MaintainceRepository;
import com.ucsc.cabservice.service.MaintainceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jinadi
 */
@Service
@Transactional
public class MaintanceServiceImpl implements MaintainceService{
    @Autowired
    private MaintainceRepository maintanceRepository;
    
    
    static long x=2;
    @Override
    public Maintance addMaintance(Maintance p) {
        p.setMaintain_id(x);
        x++;
        return maintanceRepository.save(p);
    }

    @Override
    public Maintance updateMaintance(Maintance p) {
        return maintanceRepository.save(p);
    }

    @Override
    public List<Maintance> getAllMaintances() {
        return maintanceRepository.findAll();
    }

    @Override
    public Maintance getMaintance(Long id) {
        return maintanceRepository.findOne(id);
    }

    @Override
    public String deleteMaintance(Maintance p) {
        maintanceRepository.delete(p);
        return "true";
    }
    
}
