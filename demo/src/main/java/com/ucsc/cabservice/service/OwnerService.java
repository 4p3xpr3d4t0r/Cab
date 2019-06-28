/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.model.Owner;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface OwnerService {

    public Owner addOwner(Owner owner);

    public Owner updateOwner(Owner owner);

    public String deleteOwner(Owner owner);

    public List<Owner> getAllOwners();

    public Owner getOwner(Long id);

    public Owner getOwnerByNic(String nic);
}
