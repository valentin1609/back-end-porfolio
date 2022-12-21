
package com.porfolio.va.controller;

import com.porfolio.va.entity.Skills;
import com.porfolio.va.service.ISSkills;
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
@RequestMapping("skills")
@CrossOrigin(origins = "http://localhost:4200")
public class CSkills {
    
   @Autowired
   public ISSkills servSkills;
    
    
   @GetMapping("/get/{id}")
   @ResponseBody
   public Skills getSkill(@PathVariable  Long id){
       return servSkills.getSkill(id);
   }
   
   
   @GetMapping("/getAll")
   @ResponseBody
   public List<Skills> getSkillslist(){
       return servSkills.getSkillslist();
   }
   
   
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/add")
   public void addSkill (@RequestBody Skills skill){
       servSkills.addSkill(skill);
       System.out.println("addSkill");
   }
      
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/edit/{id}")
       public String editSkill (@RequestBody Skills skill){
       servSkills.editSkill(skill);
       System.out.println("editSkill");
       return "Skill actualizado";
   }
   
   @PreAuthorize("hasRole('ADMIN')")    
   @DeleteMapping("/delete/{id}")
   public Long deleteSkill(@PathVariable Long id){
       servSkills.deleteSkill(id);
       System.out.println("deleteSkill");
       return id;
   }
   
    
}
