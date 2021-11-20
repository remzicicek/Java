package com.mapstruct.example.mapstruct.model;

import com.mapstruct.example.mapstruct.constants.PersonConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class PersonModel extends BaseModel {

    @Size(max = PersonConstant.MAX_NAME_SIZE)
    String name;
}
