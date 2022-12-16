
package com.porfolio.va.service;

import com.porfolio.va.entity.Education;
import com.porfolio.va.repository.REducation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEducation implements ISEducation{

    @Autowired
    public REducation repoEducation;
    
    
    @Override
    public Education getEducation(Long id){
        Education education = repoEducation.findById(id).orElse(null);
        return education;
    }
    
    @Override
    public List<Education> getEducationlist(){
    List<Education> education = repoEducation.findAll();
    return education;
    }
    
    @Override
    public void addEducation(Education edu){
        repoEducation.save(edu);
    }
    
    @Override
    public void editEducation(Education edu){
        repoEducation.save(edu);
    }
    
    @Override
    public void deleteEducation(Long id){
        repoEducation.deleteById(id);
    }
    
}
