
package com.porfolio.va.repository;

import com.porfolio.va.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RSkills extends JpaRepository<Skills, Long> {
    
}
