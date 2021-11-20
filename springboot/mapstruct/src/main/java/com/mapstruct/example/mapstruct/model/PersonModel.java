package com.mapstruct.example.mapstruct.model;

import com.mapstruct.example.mapstruct.constants.PersonConstant;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * lombok is taken from Base Model
 */
public class PersonModel extends BaseModel {

    @Size(max = PersonConstant.MAX_NAME_SIZE)
    String name;
}
