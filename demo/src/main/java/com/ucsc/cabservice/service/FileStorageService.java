/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;


import com.ucsc.cabservice.model.DBFile;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Jinadi
 */
public interface FileStorageService {
     public DBFile storeFile(MultipartFile file);
     public DBFile getFile(String fileId);
}
