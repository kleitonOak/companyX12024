package com.company.challenge.core.usecase.gender;

import com.company.challenge.core.entity.gender.GenderEntity;

import java.util.List;

public interface GenderSource {
    List<GenderEntity> listAll();
}
