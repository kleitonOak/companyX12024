package com.company.challenge.core.entity.person;

import com.company.challenge.core.entity.gender.GenderEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class PersonEntity {

    public PersonEntity() {
    }

    private Long idPerson;

    private GenderEntity gender;

    @NotBlank(message = "Full name is required")
    @Size(max = 50, message = "Full name must be at most 50 characters")
    private String fullName;

    private LocalDate birthdate;

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private PersonEntity(Builder builder){
        this.idPerson = builder.idPerson;
        this.gender = builder.gender;
        this.fullName = builder.fullName;
        this.birthdate = builder.birthdate;
    }

    public static class Builder{
        private Long idPerson;
        private GenderEntity gender;
        private String fullName;
        private LocalDate birthdate;
        public static Builder create(){
            return new Builder();
        }

        public Builder idPerson(Long idPerson){
            this.idPerson = idPerson;

            return this;
        }

        public Builder gender(GenderEntity gender){
            this.gender = gender;
            return this;
        }

        public Builder fullName(String fullName){
            this.fullName = fullName;
            return this;
        }

        public Builder birthdate(LocalDate birthdate){
            this.birthdate = birthdate;

            return this;
        }

        public PersonEntity build(){
            return new PersonEntity(this);
        }
    }
}
