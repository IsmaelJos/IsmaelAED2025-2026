package com.docencia.personas.services.implementacion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.docencia.personas.model.Rol;
import com.docencia.personas.services.IRoleService;

@SpringBootTest
public class RoleServiceTest {
    
    private static final String ROL_NOMBRE = "RolNombre";
    private static final String ROL_1 = "ROL_1";
    IRoleService roleService;
    Rol rol;
    

    @Autowired
    public void setRoleService(IRoleService roleService) {
        this.roleService = roleService;
    }
    
    @BeforeEach
    void beforeEach(){
        if (rol == null) {
            rol = new Rol(ROL_1,ROL_NOMBRE);
        }
        roleService.save(rol);
    }

    @AfterEach
    void AfterEach(){
        Rol rolDelete = new Rol(ROL_1);
        roleService.delete(rolDelete);
        rolDelete = roleService.findById(rolDelete);
        Assertions.assertNull(rolDelete);
    }

    @Test
    void findByTest(){
        Rol rolFind = new Rol(ROL_1);
        rolFind = roleService.findById(rolFind);
        Assertions.assertNotNull(rolFind);  
        Assertions.assertEquals(rol, rolFind);
        Assertions.assertEquals(ROL_1, rolFind.getId());
        Assertions.assertEquals(ROL_NOMBRE, rolFind.getNombre());
    }

    @Test
    void testFindById() {

    }

    @Test
    void testSave() {

    }

    
}
