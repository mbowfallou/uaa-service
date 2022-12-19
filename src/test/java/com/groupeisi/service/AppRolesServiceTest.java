package com.groupeisi.service;

import com.groupeisi.dto.AppRoles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppRolesServiceTest {
    @Autowired
    private AppRolesService appRolesService;

    @Test
    void getAppRoles() {
        int taille = appRolesService.getAppRoles().size();

        Assertions.assertEquals(2, taille);
    }

    @Test
    void getAppRoleById() {
        AppRoles role = appRolesService.getAppRole(1);
        //System.out.println(role);

        Assertions.assertNotNull(role);
    }

    @Test
    void getAppRoleByName() {
        AppRoles role = new AppRoles();
        role.setNom("ROLE_ADMIN");

        AppRoles role_saved = appRolesService.getAppRole("ROLE_ADMIN");

        Assertions.assertEquals(role.getNom(), role_saved.getNom());
    }

    @Test
    void createAppRole() {
        AppRoles role = new AppRoles();
        //role.setNom("ROLE_SUPERADMIN");
        role.setNom("ROLE_A_Supprimer");

        AppRoles role_save = appRolesService.createAppRole(role);

        Assertions.assertNotNull(role_save);
    }

    @Test
    void updateAppRole() {
        AppRoles role = appRolesService.getAppRole(2);
        role.setNom("USER_SIMPLE");

        AppRoles role_saved = appRolesService.updateAppRole(2, role);
        Assertions.assertEquals(role.getNom(), role_saved.getNom());
    }

    @Test
    void deleteAppRole() {
        appRolesService.deleteAppRole(1);

        Assertions.assertTrue(true);
    }
}