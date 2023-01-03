package com.porfolio.va.controller;

import com.porfolio.va.entity.Idioms;
import com.porfolio.va.service.ISIdioms;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("idioms")
@CrossOrigin(origins = {"https://porfolio-frontend-35558.web.app/" , "http://localhost:4200"})
public class CIdioms {

    @Autowired
    public ISIdioms servIdioms;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Idioms> getIdiomslist() {
        return servIdioms.getIdiomlist();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addIdiom(@RequestBody Idioms idiom) {
        servIdioms.addIdiom(idiom);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void editIdiom(@RequestBody Idioms idiom) {
        servIdioms.editIdiom(idiom);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteIdiom(@PathVariable Long id) {
        servIdioms.deleteIdiom(id);
    }

}
