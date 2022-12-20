package com.groupeisi.service;

import com.groupeisi.dto.AppUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppUserServiceTest {
    @Autowired
    private AppUserService appUserService;

    @Test
    void createAppUser(){
        AppUser user = new AppUser();
        user.setPrenom("Djeum");
        user.setNom("DIENG");
        user.setEmail("dieuwrine@gmail.com");

        AppUser user_save = appUserService.createAppUser(user);

        Assertions.assertEquals(user.getPrenom(), user_save.getPrenom());
    }

    @Test
    void getAppUserByLastame() {
        AppUser user = new AppUser();
        user.setNom("MBOW");

        List<AppUser> users_save = appUserService.getAppUserByLastname("MBOW");
        Assertions.assertEquals(user.getNom(), users_save.get(0).getNom());
    }

    @Test
    void getAppUserByFirstname() {
        AppUser user = new AppUser();
        user.setPrenom("Fallou");

        List<AppUser> users_save = appUserService.getAppUserByFirstname("Fallou");
        Assertions.assertEquals(user.getPrenom(), users_save.get(0).getPrenom());
    }

    @Test
    void getAppUserByEmail() {
        AppUser user = new AppUser();
        user.setEmail("mbow@gmail.com");

        AppUser user_save = appUserService.getAppUserByEmail("mbow@gmail.com");
        Assertions.assertEquals(user.getEmail(), user_save.getEmail());
    }

    @Test
    void getAppUsers(){
        List<AppUser> users = appUserService.getAppUsers();

        Assertions.assertNotNull(users);
    }

    @Test
    void getAppUser(){
        AppUser user_save = appUserService.getAppUser(1);

        Assertions.assertEquals("MBOW", user_save.getNom());
    }

    @Test
    void updateAppUser(){
        AppUser user = new AppUser();
        user.setPrenom("Alle2");
        user.setNom("LADIANE2");
        user.setEmail("ladioula2@yahoo.fr");

        AppUser user_save = appUserService.updateAppUser(2, user);

        Assertions.assertEquals(user.getPrenom(), user_save.getPrenom());
    }

    @Test
    void deleteAppUser(){
        appUserService.deleteAppUser(4);

        Assertions.assertTrue(true);
    }
}
