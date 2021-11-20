package com.mapstruct.example.mapstruct.controller.impl;

import com.mapstruct.example.mapstruct.controller.PersonRestController;
import com.mapstruct.example.mapstruct.entity.PersonEntity;
import com.mapstruct.example.mapstruct.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<PersonEntity> save(@Valid @NotNull PersonEntity person) {
        PersonEntity newPerson = personService.save(person);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PersonEntity> getById(@Valid @NotNull Long id) {
        PersonEntity getPerson = personService.getById(id);
        return new ResponseEntity<>(getPerson, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> delete(@Valid @NotNull Long id) {
        personService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
