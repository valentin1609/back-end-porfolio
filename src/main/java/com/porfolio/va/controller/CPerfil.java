package com.porfolio.va.controller;

import com.porfolio.va.entity.Perfil;
import com.porfolio.va.security.service.SUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("perfil")
@CrossOrigin(origins = {"https://porfolio-frontend-35558.web.app/" , "http://localhost:4200"})
public class CPerfil {


    @Autowired
    public SUsuario userServ;

 
    @GetMapping("/get/{username}")
    @ResponseBody
    public Perfil getPerfil(@PathVariable String username) {
       return userServ.getByUsername(username).get().getPerfil();
    }



}
