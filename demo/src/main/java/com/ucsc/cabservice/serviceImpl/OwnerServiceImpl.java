/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.model.Owner;
import com.ucsc.cabservice.repository.OwnerRepository;
import com.ucsc.cabservice.service.OwnerService;
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
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Owner addOwner(Owner p) {
        return ownerRepository.save(p);
    }

    @Override
    public Owner updateOwner(Owner p) {
        return ownerRepository.save(p);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner getOwner(Long id) {
        return ownerRepository.findOne(id);
    }

    @Override
    public String deleteOwner(Owner p) {
        ownerRepository.delete(p);
        return "true";
    }

    @Override
    public Owner getOwnerByNic(String nic) {
        Owner d = ownerRepository.getOwnerByNIC(nic);
        System.out.println("driver list : " + d.getName());
        return d;
    }

}
