package com.mapstruct.example.mapstruct.controller.impl;

import com.mapstruct.example.mapstruct.controller.PersonRestController;
import com.mapstruct.example.mapstruct.model.PersonModel;
import com.mapstruct.example.mapstruct.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class PersonRestControllerImpl implements PersonRestController {

    PersonService personService;

    @Autowired
    public PersonRestControllerImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public ResponseEntity<PersonModel> save(@Valid @NotNull PersonModel person) {
        PersonModel newPerson = personService.save(person);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PersonModel> getById(@Valid @NotNull Long id) {
        PersonModel getPerson = personService.getById(id);
        return new ResponseEntity<>(getPerson, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deleteById(@Valid @NotNull Long id) {
        personService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
