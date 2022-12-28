
package com.porfolio.va.service;

import com.porfolio.va.entity.OtherSkills;
import java.util.List;


public interface ISOtherSkills {
    public OtherSkills getOSkill(Long id);
    
    public List<OtherSkills> getOSkillslist();
    
    public void addOSkill(OtherSkills skill);
    
    public void editOSkill(OtherSkills skill);
    
    public void deleteOSkill(Long id);
}
