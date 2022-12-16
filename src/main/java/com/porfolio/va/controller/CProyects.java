
package com.porfolio.va.controller;

import com.porfolio.va.entity.Proyects;
import com.porfolio.va.service.ISProyects;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    
   @GetMapping("/ver/{id}")
   public Proyects verProyect(@PathVariable  Long id){
       return servProyects.verProyects(id);
   }
   
   
   @GetMapping("/vertodos")
   public List<Proyects> verProyects(){
       return servProyects.verProyects();
   }
   
   
   @PostMapping("/crear")
   public String agregarProyect (@RequestBody Proyects proyect){
       servProyects.crearProyects(proyect);
       return "Proyect agregado";
   }
      
   @PutMapping("/actualizar/{id}")
       public String actualizarProyect (@RequestBody Proyects proyect){
       servProyects.editarProyects(proyect);
       return "Proyect actualizado";
   }
       
   @DeleteMapping("/borrar/{id}")
   public String eliminarProyect(@PathVariable Long id){
       servProyects.eliminarProyects(id);
       return "Proyect eliminado";
   }
    
}
