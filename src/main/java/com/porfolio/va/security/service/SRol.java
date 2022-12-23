package com.porfolio.va.security.service;

import com.porfolio.va.security.entity.Rol;
import com.porfolio.va.security.entity.RolNombre;
import com.porfolio.va.security.repository.RRol;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRol {

    @Autowired
    public RRol repoRol;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return repoRol.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        repoRol.save(rol);
    }
}
