
package com.porfolio.va.service;

import com.porfolio.va.entity.Proyects;
import com.porfolio.va.repository.RProyects;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyects implements ISProyects{
    
    @Autowired
    public RProyects repoProyects; 
    
    @Override
    public Proyects verProyects(Long id){
    Proyects proyect = repoProyects.findById(id).orElse(null);
    return proyect;
    }
    
    @Override
    public List<Proyects> verProyects(){
    List<Proyects> proyectos = repoProyects.findAll();
    return proyectos;
    }
    
    @Override
    public void crearProyects(Proyects proyect){
    repoProyects.save(proyect);
    }
    
    @Override
    public void editarProyects(Proyects proyect){
    repoProyects.save(proyect);
    }
    
    @Override
    public void eliminarProyects(Long id){
    repoProyects.deleteById(id);
    }
    
}
