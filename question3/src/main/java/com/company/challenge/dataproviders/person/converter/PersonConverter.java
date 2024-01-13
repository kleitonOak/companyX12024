package com.company.challenge.dataproviders.person.converter;

import com.company.challenge.core.entity.person.PersonEntity;
import com.company.challenge.dataproviders.database.entity.GenderDB;
import com.company.challenge.dataproviders.database.entity.PersonDB;
import com.company.challenge.dataproviders.gender.converter.GenderConverter;

import java.util.Objects;

public class PersonConverter {
    private PersonConverter(){

    }

    public static PersonEntity DBToEntity(PersonDB db){
        if(Objects.isNull(db)){
            return null;
        }

        return PersonEntity.Builder.create().
                idPerson(db.getIdPerson())
                .gender(GenderConverter.DBToEntity(db.getGender()))
                .birthdate(db.getBirthdate())
                .fullName(db.getFullName())
                .build();
    }

    public static PersonDB EntityToDB(PersonEntity entity){
        PersonDB personDB = new PersonDB();
        GenderDB genderDB = new GenderDB();
        genderDB.setIdGender(entity.getGender().getIdGender());

        personDB.setIdPerson(entity.getIdPerson());
        personDB.setBirthdate(entity.getBirthdate());
        personDB.setGender(genderDB);
        personDB.setFullName(entity.getFullName());

        return personDB;
    }
}
