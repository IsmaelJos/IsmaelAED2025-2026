package com.docencia.personas.services;


import com.docencia.personas.model.Rol;

public interface IRoleService {

    public Rol save(Rol rol);
    public Rol findById(Rol rol);
    public Boolean delete(Rol rol);
}