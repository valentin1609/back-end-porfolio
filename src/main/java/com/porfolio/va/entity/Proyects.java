
package com.porfolio.va.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyects {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;


private String url;
private String descripcion;
private String nombre;
private String foto;

    public Proyects() {
    }


    
}
