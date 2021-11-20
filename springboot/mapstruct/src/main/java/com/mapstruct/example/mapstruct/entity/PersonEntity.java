package com.mapstruct.example.mapstruct.entity;

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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "people")
public class PersonEntity extends BaseEntity{

    @NotBlank
    @Column(name = PersonConstant.COLUMN_PERSON_NAME, nullable = false)
    @Size(max = PersonConstant.MAX_NAME_SIZE)
    @UniqueElements
    String name;
}
