package com.company.challenge.dataproviders.gender.converter;

import com.company.challenge.core.entity.gender.GenderEntity;
import com.company.challenge.dataproviders.database.entity.GenderDB;

import java.util.Objects;

public class GenderConverter {
    private GenderConverter(){

    }

    public static GenderEntity DBToEntity(GenderDB db){
        if(Objects.isNull(db)){
            return null;
        }

        return GenderEntity.Builder.create().id(db.getIdGender()).name(db.getName()).build();
    }

}
