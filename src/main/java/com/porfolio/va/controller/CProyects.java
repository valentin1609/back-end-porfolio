
package com.porfolio.va.controller;

import com.porfolio.va.entity.Proyects;
import com.porfolio.va.service.ISProyects;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyects")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyects {
    
   @Autowired
   public ISProyects servProyects;
    
    
   @GetMapping("/get/{id}")
   public Proyects verProyect(@PathVariable  Long id){
       return servProyects.verProyects(id);
   }
   
   
   @GetMapping("/getAll")
   public List<Proyects> verProyects(){
       return servProyects.verProyects();
   }
   
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/add")
   public void agregarProyect (@RequestBody Proyects proyect){
       servProyects.crearProyects(proyect);
   }
      
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/edit")
       public void actualizarProyect (@RequestBody Proyects proyect){
       servProyects.editarProyects(proyect);
   }
   
   @PreAuthorize("hasRole('ADMIN')")    
   @DeleteMapping("/delete/{id}")
   public void eliminarProyect(@PathVariable Long id){
       servProyects.eliminarProyects(id);
   }
    
}
