
package com.porfolio.va.controller;

import com.porfolio.va.entity.Education;
import com.porfolio.va.service.ISEducation;
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
@RequestMapping("education")
@CrossOrigin(origins = {"https://porfolio-frontend-35558.web.app/" , "http://localhost:4200"})
public class CEducation {
 
    @Autowired
    public ISEducation servEducation;

    
   @GetMapping("/get/{id}")
   @ResponseBody
   public Education getEducation(@PathVariable  Long id){
       return servEducation.getEducation(id);
   }
   
   @GetMapping("/getAll")
   @ResponseBody
   public List<Education> verEducation(){
       return servEducation.getEducationlist();
   }
   
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/add")
   public void addEducation (@RequestBody Education edu){
       servEducation.addEducation(edu);
   }
      
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/edit")
       public void editUsuario (@RequestBody Education edu){
       servEducation.editEducation(edu);
   }
      
   @PreAuthorize("hasRole('ADMIN')")
   @DeleteMapping("/delete/{id}")
   public Long deleteEducation(@PathVariable Long id){
       servEducation.deleteEducation(id);
       return id;
   }
    
    
}
