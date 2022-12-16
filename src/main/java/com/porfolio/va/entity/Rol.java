
package com.porfolio.va.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Rol {
    
@Id
private long id;
 
private int rol;

public Rol() {
}
 
    
}
