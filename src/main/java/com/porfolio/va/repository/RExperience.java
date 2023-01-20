
package com.porfolio.va.repository;

import com.porfolio.va.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperience extends JpaRepository<Experience , Long>{
    
}
