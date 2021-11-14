package com.querydslexample.querydsl.entity;

import com.querydslexample.querydsl.Constants.CityConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cities")
public class CityEntity extends BaseEntity{

    @Column(name = CityConstant.COLUMN_CITY_NAME, length = 50, nullable = false, unique = true)
    @NotBlank
    String name;
}
