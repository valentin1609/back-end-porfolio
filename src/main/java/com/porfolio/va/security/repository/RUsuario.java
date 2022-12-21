
package com.porfolio.va.security.repository;


import com.porfolio.va.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository<Usuario, Long>{
    
    Optional<Usuario> findByUsername(String username);
 
    boolean existsByUsername(String username);
    
    boolean existsByEmail(String email);
}
