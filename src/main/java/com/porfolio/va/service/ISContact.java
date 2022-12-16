
package com.porfolio.va.service;

import com.porfolio.va.entity.Contact;
import java.util.List;


public interface ISContact {
    
    public Contact verContacto(Long id);
    
    public List<Contact> verContactos();
    
    public void crearContacto(Contact contact);
    
    public void editarContacto(Contact contact);
    
    public void eliminarContacto(Long id);
    
}
