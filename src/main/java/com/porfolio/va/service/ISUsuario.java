
package com.porfolio.va.service;

import com.porfolio.va.entity.Usuario;
import java.util.List;


public interface ISUsuario {
    
    public Usuario getUser(Long id);
    
    public List<Usuario> getUserlist();
    
    public void addUser(Usuario user);
    
    public void editUser(Usuario user); 
    
//    public void editaUsuario(Long id, String newUsername, String newPassword, String newEmail);
    
//    public void editarUsuario(Long id,Usuario user);
    
    public void deleteUser(Long id);
    
}
