
package com.porfolio.va.security.service;


import com.porfolio.va.security.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.va.security.repository.RUsuario;
import jakarta.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SUsuario {

    
    @Autowired
    public RUsuario repoUsuario;
    
    
    public Optional<Usuario> getByUsername(String username) {
        return repoUsuario.findByUsername(username);
    }
    
    public boolean existByUsername(String username) {
        return repoUsuario.existsByUsername(username);
    }
    
    public boolean existByEmail(String email) {
        return repoUsuario.existsByEmail(email);
    }
    
    public void save(Usuario usuario) {
        repoUsuario.save(usuario);
    }
    
    
}
