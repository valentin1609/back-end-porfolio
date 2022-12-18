
package com.porfolio.va.repository;

import com.porfolio.va.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository<Usuario, Long>{
    
    public Usuario finByUsername(String username);
    
}
