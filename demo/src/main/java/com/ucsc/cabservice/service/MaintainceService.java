/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Maintance;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface MaintainceService {

    public Maintance addMaintance(Maintance maintance);

    public Maintance updateMaintance(Maintance maintance);

    public String deleteMaintance(Maintance maintance);

    public List<Maintance> getAllMaintances();

    public Maintance getMaintance(Long id);
}
