/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Dameges;
import com.ucsc.cabservice.repository.DamageRepository;
import com.ucsc.cabservice.service.DamageService;
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
public class DamageServiceImpl implements DamageService{
    @Autowired
    private DamageRepository damagesRepository;
    
  
    static long x = 5;
    @Override
    public Dameges addDamage(Dameges p) {
        p.setDamage_id(x);
        x++;
        return damagesRepository.save(p);
    }

    @Override
    public Dameges updateDamage(Dameges p) {
        return damagesRepository.save(p);
    }

    @Override
    public List<Dameges> getAllDamages() {
        return damagesRepository.findAll();
    }

    @Override
    public Dameges getDamage(Long id) {
        return damagesRepository.findOne(id);
    }

    @Override
    public String deleteDamage(Dameges p) {
        damagesRepository.delete(p);
        return "true";
    }
    
}
