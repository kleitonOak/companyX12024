package com.company.challenge.dataproviders.database.repository;

import com.company.challenge.dataproviders.database.entity.GenderDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<GenderDB, Long> {
}
