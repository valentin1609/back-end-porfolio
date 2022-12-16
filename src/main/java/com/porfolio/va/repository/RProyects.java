
package com.porfolio.va.repository;

import com.porfolio.va.entity.Proyects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyects extends JpaRepository<Proyects , Long>{
    
}
