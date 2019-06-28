/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Maintance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jinadi
 */
public interface MaintainceRepository extends JpaRepository<Maintance, Long>{
    
}
