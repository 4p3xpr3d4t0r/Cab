/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Dameges;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface DamageService {

    public Dameges addDamage(Dameges damage);

    public Dameges updateDamage(Dameges damage);

    public String deleteDamage(Dameges damage);

    public List<Dameges> getAllDamages();

    public Dameges getDamage(Long id);
}
