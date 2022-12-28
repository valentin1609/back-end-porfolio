
package com.porfolio.va.repository;

import com.porfolio.va.entity.OtherSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ROtherSkills extends JpaRepository<OtherSkills, Long> {
    
}
