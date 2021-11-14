package com.querydslexample.querydsl.controller;

import com.querydslexample.querydsl.entity.CityEntity;
import com.querydslexample.querydsl.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class CityRestControllerImpl implements CityRestController{

    CityService cityService;

    @Autowired
    public CityRestControllerImpl(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public ResponseEntity<CityEntity> save(@Valid @NotNull @RequestBody CityEntity city) {
        CityEntity newCity = cityService.save(city);
        return new ResponseEntity<>(newCity, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> delete(@Valid @NotNull Long id) {
        cityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
