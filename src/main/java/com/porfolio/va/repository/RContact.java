
package com.porfolio.va.repository;

import com.porfolio.va.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RContact extends JpaRepository<Contact, Long>{
    
}



