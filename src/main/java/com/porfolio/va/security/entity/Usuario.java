
package com.porfolio.va.security.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter   
public class Usuario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(unique = true) 
private String username;

private String password;

private String email;

@ManyToMany(fetch = FetchType.EAGER)
//se crea una nueva tabla usuario_rol donde estaran los id de usuario y rol
@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id") )
private Set<Rol> roles = new HashSet<>(); 



public Usuario() {
}

public Usuario(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
}


}
