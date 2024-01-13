package com.company.challenge.endpoints;

import com.company.challenge.core.usecase.gender.GenderUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/gender")
public class GenderController {
    private GenderUseCase useCase;

    public GenderController(GenderUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public String listAll(Model model){
        model.addAttribute("genders", useCase.list());
        return "gender/list";
    }
}
