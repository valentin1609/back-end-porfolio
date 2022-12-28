package com.porfolio.va.service;

import com.porfolio.va.entity.OtherSkills;
import com.porfolio.va.repository.ROtherSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOtherSkills implements ISOtherSkills {
    
    @Autowired
    public ROtherSkills repoOS;
    
    @Override
    public OtherSkills getOSkill(Long id) {
        OtherSkills skill = repoOS.findById(id).orElse(null);        
        return skill;
    }
    
    @Override
    public List<OtherSkills> getOSkillslist() {
        List<OtherSkills> skills = repoOS.findAll();
        return skills;
    }
    
    @Override
    public void addOSkill(OtherSkills skill) {
        repoOS.save(skill);
    }
    
    @Override
    public void editOSkill(OtherSkills skill) {
        repoOS.save(skill);
    }
    
    @Override
    public void deleteOSkill(Long id) {
        repoOS.deleteById(id);
    }
    
}
