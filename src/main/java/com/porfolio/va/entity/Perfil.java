
package com.porfolio.va.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Perfil {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    
    
    private String nombre;
    private String apellido;
    private String empresa;
    private String titulo;
    
    @Column( length = 999)
    private String presentacion;

    public Perfil() {
    }
    
    
    
}
