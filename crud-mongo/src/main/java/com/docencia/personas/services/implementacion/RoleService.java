package com.docencia.personas.services.implementacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docencia.personas.model.Rol;
import com.docencia.personas.repository.RolRepository;
import com.docencia.personas.services.IRoleService;

@Service
public class RoleService implements IRoleService {

    
    private RolRepository rolRepository;

    @Autowired
    public RoleService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }
    
    public Rol findById(Rol rol){
        return rolRepository.findById(rol.getId()).orElse(null);
    }

    @Override
    public Boolean delete(Rol rol) {
        rolRepository.delete(rol);
        return true;
    }
}
