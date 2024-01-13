package com.company.challenge.core.usecase.person;

import com.company.challenge.core.entity.person.PersonEntity;

import java.util.List;

public interface PersonSource {
    List<PersonEntity> listAll();
    PersonEntity save(PersonEntity person);

    void deletePerson(Long id);

    PersonEntity findById(Long id );
}
