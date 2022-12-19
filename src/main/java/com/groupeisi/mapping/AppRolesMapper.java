package com.groupeisi.mapping;

import com.groupeisi.dto.AppRoles;
import com.groupeisi.entities.AppRolesEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
