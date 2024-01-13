package com.company.challenge.dataproviders.database.repository;

import com.company.challenge.dataproviders.database.entity.PersonDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDB, Long> {
}
