
package com.porfolio.va.service;

import com.porfolio.va.entity.Skills;
import java.util.List;


public interface ISSkills {
    public Skills getSkill(Long id);
    
    public List<Skills> getSkillslist();
    
    public void addSkill(Skills skill);
    
    public void editSkill(Skills skill);
    
    public void deleteSkill(Long id);
}
