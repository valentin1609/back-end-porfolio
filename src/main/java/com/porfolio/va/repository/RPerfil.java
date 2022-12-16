
package com.porfolio.va.repository;

import com.porfolio.va.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPerfil extends JpaRepository<Perfil , Long>{
    
}
