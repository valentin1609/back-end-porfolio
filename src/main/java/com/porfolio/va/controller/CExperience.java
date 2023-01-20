package com.porfolio.va.controller;

import com.porfolio.va.entity.Experience;
import com.porfolio.va.service.ISExperience;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experience")
@CrossOrigin(origins = {"https://porfolio-frontend-35558.web.app/", "http://localhost:4200"})
public class CExperience {

    @Autowired
    public ISExperience servExperience;

    @GetMapping("/get/{id}")
    public Experience verExperience(@PathVariable Long id) {
        return servExperience.verExperience(id);
    }

    @GetMapping("/getAll")
    public List<Experience> verExperiences() {
        return servExperience.verExperiences();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void agregarExperience(@RequestBody Experience experience) {
        servExperience.crearExperience(experience);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void actualizarExperience(@RequestBody Experience experience) {
        servExperience.editarExperience(experience);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void eliminarProyect(@PathVariable Long id) {
        servExperience.eliminarExperience(id);
    }

}
