
package com.porfolio.va.service;


import com.porfolio.va.entity.Proyects;
import java.util.List;


public interface ISProyects {
    
    public Proyects verProyects(Long id);
    
    public List<Proyects> verProyects();
    
    public void crearProyects(Proyects proyect);
    
    public void editarProyects(Proyects proyect);
    
    public void eliminarProyects(Long id);
    
}
