package com.company.challenge.core.usecase.person;

import com.company.challenge.core.entity.person.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonUseCase {
    private PersonSource source;

    public PersonUseCase(PersonSource source) {
        this.source = source;
    }

    public List<PersonEntity> list(){
        return source.listAll();
    }

    public void createPerson(PersonEntity person) {
        source.save(person);
    }

    public PersonEntity getPersonById(Long id) {
        return source.findById(id);
    }

    public void updatePerson(PersonEntity person) {
        source.save(person);
    }

    public void deletePerson(Long id) {
        source.deletePerson(id);
    }
}
