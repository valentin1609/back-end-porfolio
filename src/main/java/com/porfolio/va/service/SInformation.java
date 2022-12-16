
package com.porfolio.va.service;

import com.porfolio.va.entity.Information;
import com.porfolio.va.repository.RInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SInformation implements ISInformation{
    
    @Autowired
    public RInformation repoInformation; 
    
    
    @Override
    public Information getInformation(Long id){
    Information info = repoInformation.findById(id).orElse(null);  
    return info;
    }
    
    @Override
    public void editInformation(Information info){
        repoInformation.save(info);
    }
    
}
