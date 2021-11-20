package com.mapstruct.example.mapstruct.service.impl;

import com.mapstruct.example.mapstruct.entity.PersonEntity;
import com.mapstruct.example.mapstruct.exception.PersonException;
import com.mapstruct.example.mapstruct.repository.PersonRepository;
import com.mapstruct.example.mapstruct.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonEntity save(PersonEntity person) {
        return personRepository.save(person);
    }

    @Override
    public PersonEntity getById(Long id) {
        if(!personRepository.existsById(id)){
            throw new PersonException("Person is not Found");
        }
        return personRepository.getById(id);
    }

    @Override
    public void delete(Long id) {
        if(personRepository.existsById(id))
            personRepository.deleteById(id);
    }
}
