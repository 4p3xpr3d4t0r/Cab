/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.model.Owner;
import com.ucsc.cabservice.model.Ride;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jinadi
 */
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @Query("select d from Owner d where d.owner_id=:nic")
    public Owner getOwnerByNIC(@Param("nic") String nic);
}
