package com.company.challenge.endpoints;

import com.company.challenge.core.entity.person.PersonEntity;
import com.company.challenge.core.usecase.gender.GenderUseCase;
import com.company.challenge.core.usecase.person.PersonUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {
    private PersonUseCase useCase;
    private GenderUseCase genderUseCase;

    public PersonController(PersonUseCase useCase, GenderUseCase genderUseCase) {
        this.useCase = useCase;
        this.genderUseCase = genderUseCase;
    }

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("persons", useCase.list());
        return "person/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("genders", genderUseCase.list());
        model.addAttribute("person", new PersonEntity());
        return "person/create";
    }

    @PostMapping("/create")
    public String createPerson(@ModelAttribute PersonEntity person) {
        useCase.createPerson(person);
        return "redirect:/person";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        PersonEntity person = useCase.getPersonById(id);
        model.addAttribute("genders", genderUseCase.list());
        model.addAttribute("person", person);
        return "person/edit";
    }

    @PostMapping("/{id}/edit")
    public String editPerson(@PathVariable Long id, @ModelAttribute PersonEntity person) {
        person.setIdPerson(id);
        useCase.updatePerson(person);
        return "redirect:/person";
    }

    @GetMapping("/{id}/delete")
    public String deletePerson(@PathVariable Long id) {
        useCase.deletePerson(id);
        return "redirect:/person";
    }
}
