package com.company.challenge.dataproviders.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TB_GENDER")
public class GenderDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGender;

    @NotBlank(message = "Name is required")
    @Size(max = 10, message = "Name must be at most 10 characters")
    private String name;

    public Long getIdGender() {
        return idGender;
    }

    public void setIdGender(Long idGender) {
        this.idGender = idGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
