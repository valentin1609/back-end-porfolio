
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
public class Education {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String nombre;

private String instituto;

@Column( length = 1500)
private String foto; 

private String inicio;

private String fin;

    public Education() {
    }



}
