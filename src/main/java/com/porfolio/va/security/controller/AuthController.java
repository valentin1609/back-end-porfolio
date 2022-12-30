
package com.porfolio.va.security.controller;

import com.porfolio.va.security.entity.Rol;
import com.porfolio.va.security.entity.RolNombre;
import com.porfolio.va.security.entity.Usuario;
import com.porfolio.va.security.jwt.JwtProvider;
import com.porfolio.va.security.service.SRol;
import com.porfolio.va.security.service.SUsuario;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    JwtProvider jwtProvider;  
    
    @Autowired
    SUsuario ServUsuario;
    
    @Autowired
    SRol ServRol;
    

   @PostMapping("/new")
    public ResponseEntity<?> nuevo(@Validated @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) {
        
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);
        
        if(ServUsuario.existByUsername(nuevoUsuario.getUsername()))
            return new ResponseEntity(new Mensaje("Ese nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
        
        if(ServUsuario.existByEmail(nuevoUsuario.getEmail()))
            return new ResponseEntity(new Mensaje("Ese email ya existe"), HttpStatus.BAD_REQUEST);
        
        
        Usuario usuario = new Usuario( 
                nuevoUsuario.getNombre()
                ,nuevoUsuario.getApellido()
                ,nuevoUsuario.getUsername() 
                , passwordEncoder.encode(nuevoUsuario.getPassword())
                , nuevoUsuario.getEmail() 
                ,nuevoUsuario.getOcupacion()
                ,nuevoUsuario.getEmpresa()
                );
        
        //rol user por defecto
        Set<Rol> roles = new HashSet<>();
        roles.add(ServRol.getByRolNombre(RolNombre.ROLE_USER).get());
        
        if(nuevoUsuario.getRoles().contains("admin"))
            roles.add(ServRol.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        
        usuario.setRoles(roles);
        ServUsuario.save(usuario);
        
        return new ResponseEntity(new Mensaje("Usuario guardado"), HttpStatus.CREATED);
    }
    
    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Validated @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal colocados"), HttpStatus.BAD_REQUEST);
        
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken( loginUsuario.getUsername(), loginUsuario.getPassword() ));
        
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        String jwt = jwtProvider.generateToken(authentication);
        
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
    
    
}
