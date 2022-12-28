
package com.porfolio.va.repository;

import com.porfolio.va.entity.Idioms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RIdioms extends JpaRepository<Idioms, Long>{
    
}
