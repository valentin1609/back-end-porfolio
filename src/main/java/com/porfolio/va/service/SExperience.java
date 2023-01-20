package com.porfolio.va.service;

import com.porfolio.va.entity.Experience;
import com.porfolio.va.repository.RExperience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SExperience implements ISExperience {

    @Autowired
    RExperience repoExperience;

    @Override
    public Experience verExperience(Long id) {
        Experience exp = repoExperience.findById(id).orElse(null);
        return exp;
    }

    @Override
    public List<Experience> verExperiences() {
        List<Experience> exps = repoExperience.findAll();
        return exps;
    }

    @Override
    public void crearExperience(Experience experience) {
        repoExperience.save(experience);
    }

    @Override
    public void editarExperience(Experience experience) {
        repoExperience.save(experience);
    }

    @Override
    public void eliminarExperience(Long id) {
        repoExperience.deleteById(id);
    }

}
