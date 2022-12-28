
package com.porfolio.va.service;

import com.porfolio.va.entity.Idioms;
import java.util.List;


public interface ISIdioms {
    
    public Idioms getIdiom(Long id);
    
    public List<Idioms> getIdiomlist();
    
    public void addIdiom(Idioms idiom);
    
    public void editIdiom(Idioms idiom);
    
    public void deleteIdiom(Long id);
    
}
