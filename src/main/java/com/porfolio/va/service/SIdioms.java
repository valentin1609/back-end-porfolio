package com.porfolio.va.service;

import com.porfolio.va.entity.Idioms;
import com.porfolio.va.repository.RIdioms;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SIdioms implements ISIdioms {

    @Autowired
    public RIdioms repoIdioms;

    @Override
    public Idioms getIdiom(Long id) {
        Idioms idiom = repoIdioms.findById(id).orElse(null);
        return idiom;
    }

    @Override
    public List<Idioms> getIdiomlist() {
        List<Idioms> idioms = repoIdioms.findAll();
        return idioms;
    }

    @Override
    public void addIdiom(Idioms idiom) {
        repoIdioms.save(idiom);
    }

    @Override
    public void editIdiom(Idioms idiom) {
        repoIdioms.save(idiom);
    }

    @Override
    public void deleteIdiom(Long id) {
        repoIdioms.deleteById(id);
    }

}
