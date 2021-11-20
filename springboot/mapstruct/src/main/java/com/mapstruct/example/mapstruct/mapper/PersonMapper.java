package com.mapstruct.example.mapstruct.mapper;

import com.mapstruct.example.mapstruct.entity.PersonEntity;
import com.mapstruct.example.mapstruct.model.PersonModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity convertToEntity(PersonModel model);
    PersonModel convertToModel(PersonEntity entity);
}
