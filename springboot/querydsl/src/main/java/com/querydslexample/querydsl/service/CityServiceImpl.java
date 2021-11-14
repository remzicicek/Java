package com.querydslexample.querydsl.service;

import com.querydslexample.querydsl.entity.CityEntity;
import com.querydslexample.querydsl.entity.QCityEntity;
import com.querydslexample.querydsl.exception.CityException;
import com.querydslexample.querydsl.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public CityEntity save(CityEntity city) {
        return cityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
        if(cityRepository.existsById(id))
            cityRepository.deleteById(id);
    }
}
