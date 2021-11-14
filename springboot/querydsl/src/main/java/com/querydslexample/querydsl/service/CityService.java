package com.querydslexample.querydsl.service;

import com.querydslexample.querydsl.entity.CityEntity;
public interface CityService {

    CityEntity save(CityEntity city);

    void delete(Long id);

}
