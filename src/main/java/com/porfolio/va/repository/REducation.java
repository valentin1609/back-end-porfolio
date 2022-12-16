
package com.porfolio.va.repository;

import com.porfolio.va.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducation extends JpaRepository<Education , Long>{
    
}
