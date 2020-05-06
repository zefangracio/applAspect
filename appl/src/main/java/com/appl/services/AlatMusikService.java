package com.appl.services;

import java.util.List;

import com.appl.model.AlatMusik;
 
public interface AlatMusikService {
 
    public void create(AlatMusik alatMusik);
 
    public void update(AlatMusik alatMusik);
 
    public void delete(AlatMusik alatMusik);
 
    public void deleteAll();
    
    public List <AlatMusik> findByNama(String nama);
    
    public List <AlatMusik> findByAsal(String asal);
 
    public List <AlatMusik> findAll();
}
