package com.mapstruct.example.mapstruct.service;


import com.mapstruct.example.mapstruct.entity.PersonEntity;
import com.mapstruct.example.mapstruct.model.PersonModel;

public interface PersonService {

    PersonModel save(PersonModel person);

    PersonModel getById(Long id);

    void deleteById(Long id);

}
