
package com.porfolio.va.controller;

import com.porfolio.va.entity.OtherSkills;
import com.porfolio.va.service.ISOtherSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("other-skills")
@CrossOrigin(origins = "http://localhost:4200")
public class COtherSkills {
    
    @Autowired
    public ISOtherSkills servOS;
    
    @GetMapping("/getAll")
    @ResponseBody
    public List<OtherSkills> getOtherSkillslist() {
        return servOS.getOSkillslist();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addOtherSkill(@RequestBody OtherSkills skill) {
        servOS.addOSkill(skill);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void editOtherSkill(@RequestBody OtherSkills skill) {
        servOS.editOSkill(skill);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteOtherSkill(@PathVariable Long id) {
        servOS.deleteOSkill(id);
    }
}
