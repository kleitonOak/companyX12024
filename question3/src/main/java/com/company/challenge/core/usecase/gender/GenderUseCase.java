package com.company.challenge.core.usecase.gender;

import com.company.challenge.core.entity.gender.GenderEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderUseCase {
    private GenderSource source;

    public GenderUseCase(GenderSource source) {
        this.source = source;
    }

    public List<GenderEntity> list(){
        return source.listAll();
    }
}
