
package com.porfolio.va.repository;

import com.porfolio.va.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RInformation extends JpaRepository<Information , Long> {
    
}
