package dev.java10x.CadastroDeNinjas.User;

import jakarta.persistence.Enumerated;
import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("admin"),
    USER("user");

    @Enumerated
    private final String role;

    UserRole(String role) {
        this.role = role;
    }

}
