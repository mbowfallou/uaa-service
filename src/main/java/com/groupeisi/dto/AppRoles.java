package com.groupeisi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoles {
    private Integer id;
    @NotNull(message = "Le nom ne doit pas etre nul!")
    private String nom;
}
