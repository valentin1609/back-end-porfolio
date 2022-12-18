
package com.porfolio.va.entity;

import com.porfolio.va.repository.RUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private RUsuario usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      //crear metodo find by username para que busque en el repositorio si hay un username que coincida o  no
      Usuario usuario = this.usuarioRepository.finByUsername(username);
      if(usuario == null){
        throw new UsernameNotFoundException("usuario no encontrado");
      }
      return usuario;
    }
    
}
