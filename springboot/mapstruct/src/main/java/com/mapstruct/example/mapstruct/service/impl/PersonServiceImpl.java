package com.mapstruct.example.mapstruct.service.impl;

import com.mapstruct.example.mapstruct.entity.PersonEntity;
import com.mapstruct.example.mapstruct.exception.PersonException;
import com.mapstruct.example.mapstruct.mapper.PersonMapper;
import com.mapstruct.example.mapstruct.model.PersonModel;
import com.mapstruct.example.mapstruct.repository.PersonRepository;
import com.mapstruct.example.mapstruct.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public PersonModel save(PersonModel person) {

        PersonEntity entity = personMapper.convertToEntity(person);
        return personMapper.convertToModel(personRepository.save(entity));
    }

    @Override
    public PersonModel getById(Long id) {
        if(!personRepository.existsById(id)){
            throw new PersonException("Person is not Found");
        }
        return personMapper.convertToModel(personRepository.getById(id));
    }

    @Override
    public void deleteById(Long id) {
        if(personRepository.existsById(id))
            personRepository.deleteById(id);
    }
}
