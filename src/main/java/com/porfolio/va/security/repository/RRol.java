
package com.porfolio.va.security.repository;

import com.porfolio.va.security.entity.Rol;
import com.porfolio.va.security.entity.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RRol extends JpaRepository<Rol , Long>{
    
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}
