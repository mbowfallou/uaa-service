package com.groupeisi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private Integer id;
    @NotNull(message = "Le nom ne doit pas etre nul!")
    private String nom;
    @NotNull(message = "Le prenom ne doit pas etre nul!")
    private String prenom;
    private String adresse;
    @NotNull(message = "L'email ne doit pas etre nul!")
    private String email;
    private String password;
    private int etat;
}
