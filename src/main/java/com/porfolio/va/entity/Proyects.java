
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
public class Proyects {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column( length = 1500)
private String url;

@Column( length = 999)
private String descripcion;

private String nombre;

private String foto;

    public Proyects() {
    }


    
}
