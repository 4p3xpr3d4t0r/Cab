/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ucsc.cabservice.model.Package;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author Jinadi
 */
 @Repository
public interface PackageRepository extends JpaRepository<Package, Long>{
     
   @Query("select p from Package p where p.package_name=:name")
     public Package getPackageByName(@Param("name") String name);
}
