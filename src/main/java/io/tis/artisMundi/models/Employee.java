package io.tis.artisMundi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "FUNCIONARIO")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    private String position;
    private String email;
    private String password;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
