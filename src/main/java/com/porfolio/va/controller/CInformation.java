
package com.porfolio.va.controller;

import com.porfolio.va.entity.Information;
import com.porfolio.va.service.ISInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("information")
@CrossOrigin(origins = "http://localhost:4200")
public class CInformation {
    
   @Autowired 
   public ISInformation servInformation; 
    
   @GetMapping("/get/{id}")
   @ResponseBody
   public Information getInformation(@PathVariable Long id){
       System.out.println("getInformation");
       return servInformation.getInformation(id);
   }
      
   @PutMapping("/edit")
       public void editInformation (@RequestBody Information info){
       servInformation.editInformation(info);
       System.out.println("editInformation");
   }
   

}
