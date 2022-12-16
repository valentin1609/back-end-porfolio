
package com.porfolio.va.service;

import com.porfolio.va.entity.Perfil;
import com.porfolio.va.repository.RPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPerfil implements ISPerfil{
    
    @Autowired
    public RPerfil repoPerfil;
    
    @Override
    public Perfil verPerfil(Long id){
    Perfil perf = repoPerfil.findById(id).orElse(null);
    return perf;
    }
    
    @Override
    public List<Perfil> verPerfil(){
    List<Perfil> perfiles = repoPerfil.findAll();
    return perfiles;
    }
    
    @Override
    public void crearPerfil(Perfil perf){}
    
    @Override
    public void editarPerfil(Perfil perf){}
    
    @Override
    public void eliminarPerfil(Long id){}
    
}
