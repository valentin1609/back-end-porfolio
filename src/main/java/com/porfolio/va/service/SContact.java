
package com.porfolio.va.service;

import com.porfolio.va.entity.Contact;
import com.porfolio.va.repository.RContact;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SContact implements ISContact{
    
    @Autowired
    public RContact repoContact;
    
    @Override
    public Contact verContacto(Long id){
    Contact contact = repoContact.findById(id).orElse(null);
    return contact;
    }
    
    @Override
    public List<Contact> verContactos(){
    List<Contact> contacts = repoContact.findAll();    
    return contacts;
    }
    
    @Override
    public void crearContacto(Contact contact){}
    
    @Override
    public void editarContacto(Contact contact){}
    
    @Override
    public void eliminarContacto(Long id){}
    
}
