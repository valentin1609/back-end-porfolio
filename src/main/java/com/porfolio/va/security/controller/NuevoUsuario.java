
package com.porfolio.va.security.controller;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NuevoUsuario {
    private String username;
    private String password;
    private String email;
    private Set<String> roles = new HashSet<>();
}
