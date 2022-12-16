
package com.porfolio.va.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Information {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String nombre;
private String apellido;
private String titulo;
private String presentacion;
private String foto;

    public Information() {
    }


        


}
