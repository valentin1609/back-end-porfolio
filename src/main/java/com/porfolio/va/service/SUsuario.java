
package com.porfolio.va.service;

import com.porfolio.va.service.ISUsuario;
import com.porfolio.va.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.va.repository.RUsuario;

@Service
public class SUsuario implements ISUsuario {

    
    @Autowired
    public RUsuario repoUsuario;

    @Override
    public Usuario getUser(Long id){
        Usuario user = repoUsuario.findById(id).orElse(null);
        return user;
    }

    @Override
    public List<Usuario> getUserlist(){
        List<Usuario> users = repoUsuario.findAll();
        return users;       
    }

    @Override
    public void addUser(Usuario user) {
        repoUsuario.save(user);
    }
    
    @Override
    public void deleteUser(Long id){
        repoUsuario.deleteById(id);
    }
   
    @Override
    public void editUser(Usuario user){
        repoUsuario.save(user);
    }
    
    
//    @Override
//    public void editaUsuario(Long id, String newUsername, String newPassword, String newEmail) {
//     Usuario user = this.verUsuario(id);
//     user.setUsername(newUsername);
//     user.setPassword(newPassword);
//     user.setEmail(newEmail);
//     repoUsuario.save(user);
//    }
   
    
//    @Override
//    public void editarUsuario(Long id,Usuario user){
//    Usuario usuario = this.verUsuario(id);
//    usuario = user;
//    repoUsuario.save(usuario);
//    }
    

    
}
