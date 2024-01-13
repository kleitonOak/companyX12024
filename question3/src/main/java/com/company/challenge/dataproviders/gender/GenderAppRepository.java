package com.company.challenge.dataproviders.gender;

import com.company.challenge.core.entity.gender.GenderEntity;
import com.company.challenge.core.usecase.gender.GenderSource;
import com.company.challenge.dataproviders.database.repository.GenderRepository;
import com.company.challenge.dataproviders.gender.converter.GenderConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenderAppRepository implements GenderSource {
    private GenderRepository genderRepository;

    public GenderAppRepository(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public List<GenderEntity> listAll() {
        return genderRepository.findAll().stream().map(GenderConverter::DBToEntity).collect(Collectors.toList());
    }
}
