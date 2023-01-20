
package com.porfolio.va.service;

import com.porfolio.va.entity.Experience;
import java.util.List;


public interface ISExperience {
    
    public Experience verExperience(Long id);
    
    public List<Experience> verExperiences();
    
    public void crearExperience(Experience experience);
    
    public void editarExperience(Experience experience);
    
    public void eliminarExperience(Long id);
    
}
