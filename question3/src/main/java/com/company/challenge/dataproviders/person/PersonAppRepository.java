package com.company.challenge.dataproviders.person;

import com.company.challenge.core.entity.person.PersonEntity;
import com.company.challenge.core.usecase.person.PersonSource;
import com.company.challenge.dataproviders.database.entity.PersonDB;
import com.company.challenge.dataproviders.database.repository.PersonRepository;
import com.company.challenge.dataproviders.person.converter.PersonConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonAppRepository implements PersonSource {
    private PersonRepository personRepository;

    public PersonAppRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonEntity> listAll() {
        return personRepository.findAll().stream().map(PersonConverter::DBToEntity).collect(Collectors.toList());
    }

    @Override
    public PersonEntity save(PersonEntity person) {
        PersonDB personDB = PersonConverter.EntityToDB(person);

        var saved = personRepository.save(personDB);

        return PersonConverter.DBToEntity(saved);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public PersonEntity findById(Long id) {

        var optional = personRepository.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        return PersonConverter.DBToEntity(optional.get());
    }


}
