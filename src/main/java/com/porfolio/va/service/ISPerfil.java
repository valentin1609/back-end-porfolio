
package com.porfolio.va.service;


import com.porfolio.va.entity.Perfil;
import java.util.List;


public interface ISPerfil {
    
    public Perfil verPerfil(Long id);
    
    public List<Perfil> verPerfil();

    public void editarPerfil(Perfil perf);
   
}
