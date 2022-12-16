
package com.porfolio.va.repository;

import com.porfolio.va.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RRol extends JpaRepository<Rol , Long>{
    
}
