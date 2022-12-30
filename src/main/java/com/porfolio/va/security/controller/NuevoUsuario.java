
package com.porfolio.va.security.controller;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NuevoUsuario {
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String email;
    private String ocupacion;
    private String empresa;
    
    
    
    
    private Set<String> roles = new HashSet<>();
}
