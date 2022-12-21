
package com.porfolio.va.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Rol {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Enumerated(EnumType.STRING)
private RolNombre rolNombre;

public Rol() {
}

public Rol(RolNombre rolNombre) {
    this.rolNombre = rolNombre;
}
 
    
}
