package ru.ivos.avito.enums;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author iVos 20.07.2022
 */
public enum Role implements GrantedAuthority {

    ROLE_USER, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
