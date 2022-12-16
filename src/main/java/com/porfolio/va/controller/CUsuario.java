
package com.porfolio.va.controller;

import com.porfolio.va.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.porfolio.va.service.ISUsuario;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:4200")
public class CUsuario {
    
    
   @Autowired 
   public ISUsuario servUsuario; 

   
   @GetMapping("/get/{id}")
   @ResponseBody 
   public Usuario getUser(@PathVariable  Long id){
       return servUsuario.getUser(id);
   }
   
   @GetMapping("/getAll")
   @ResponseBody
   public List<Usuario> getUserlist(){
       return servUsuario.getUserlist();
   }
   
   @PostMapping("/add")
   public String addUser (@RequestBody Usuario user){
       servUsuario.addUser(user);
       return "usuario agregado";
   }

   
   @DeleteMapping("/delete/{id}")
   public String deleteUser(@PathVariable Long id){
       servUsuario.deleteUser(id);
       return "Usuario eliminado";
   }
   
   @PutMapping("/edit")
   public String editUser (@RequestBody Usuario user){
       servUsuario.editUser(user);
       return "Usuario actualizado";
   }
   

}
