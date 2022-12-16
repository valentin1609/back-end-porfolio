
package com.porfolio.va.service;

import com.porfolio.va.entity.Skills;
import com.porfolio.va.repository.RSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSkills implements ISSkills{
    
    
    @Autowired
    public RSkills repoSkills;    
    
    @Override
    public Skills getSkill(Long id){
    Skills skill = repoSkills.findById(id).orElse(null);
    return skill;
    }
    
    @Override
    public List<Skills> getSkillslist(){
    List<Skills> skills = repoSkills.findAll();
    return skills;
    }
    
    @Override
    public void addSkill(Skills skill){
        repoSkills.save(skill);
    }
    
    @Override
    public void editSkill(Skills skill){
        repoSkills.save(skill);
    }
    
    @Override
    public void deleteSkill(Long id){
        repoSkills.deleteById(id);
    }
    
}
