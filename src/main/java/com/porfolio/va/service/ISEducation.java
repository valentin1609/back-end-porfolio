
package com.porfolio.va.service;


import com.porfolio.va.entity.Education;
import java.util.List;


public interface ISEducation {
    
    public Education getEducation(Long id);
    
    public List<Education> getEducationlist();
    
    public void addEducation(Education edu);
    
    public void editEducation(Education edu);
    
    public void deleteEducation(Long id);
    
}
