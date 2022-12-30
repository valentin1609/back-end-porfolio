
package com.porfolio.va.controller;

import com.porfolio.va.entity.Contact;
import com.porfolio.va.service.ISContact;
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
@RequestMapping("contact")
@CrossOrigin(origins = "http://localhost:4200")
public class CContact {
    
    @Autowired
    public ISContact servContact;
    
   @GetMapping("/get/{id}")
   public Contact verContacto(@PathVariable  Long id){
       return servContact.verContacto(id);
   }
   
   
   @GetMapping("/getAll")
   public List<Contact> verContactos(){
       return servContact.verContactos();
   }
   
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/add")
   public void agregarContacto (@RequestBody Contact contact){
       servContact.crearContacto(contact);
   }
   
    @PreAuthorize("hasRole('ADMIN')")   
   @PutMapping("/edit/{id}")
       public void actualizarContacto (@RequestBody Contact contact){
       servContact.editarContacto(contact);
   }
   
   @PreAuthorize("hasRole('ADMIN')")    
   @DeleteMapping("/delete/{id}")
   public void eliminarContacto(@PathVariable Long id){
       servContact. eliminarContacto(id);

   }
    
}
