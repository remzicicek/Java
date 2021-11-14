package com.querydslexample.querydsl.service;

import com.querydslexample.querydsl.entity.CityEntity;
public interface CityService {

    CityEntity save(CityEntity city);

    CityEntity getByName(String name);

    void delete(Long id);

}
