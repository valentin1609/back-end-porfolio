
package com.porfolio.va.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Collection;
import java.util.HashSet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Getter @Setter   
public class Usuario implements UserDetails{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String username;
private String password;
private String email;

public Usuario() {
}

private Collection<? extends GrantedAuthority> authorities;


    @Override  //aca obtengo los nombres de los roles
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;    
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;    
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;    
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
