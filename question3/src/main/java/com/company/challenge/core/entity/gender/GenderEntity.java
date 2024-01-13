package com.company.challenge.core.entity.gender;

import java.io.Serializable;

public class GenderEntity implements Serializable {
    private Long idGender;
    private String name;

    public GenderEntity() {
    }

    public GenderEntity(Long id, String name) {
        this.idGender = id;
        this.name = name;
    }

    private GenderEntity(Builder builder){
        this.idGender = builder.id;
        this.name = builder.name;
    }

    public static class Builder {
        private Long id;
        private String name;

        public static Builder create() {
            return new Builder();
        }
        public Builder id(Long id){
            this.id= id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public GenderEntity build(){
            return new GenderEntity(this);
        }
    }

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
