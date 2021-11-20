package com.mapstruct.example.mapstruct.service;


import com.mapstruct.example.mapstruct.entity.PersonEntity;

public interface PersonService {

    PersonEntity save(PersonEntity person);

    PersonEntity getById(Long id);

    void delete(Long id);

}
