package com.querydslexample.querydsl.repository;

import com.querydslexample.querydsl.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long>, QuerydslPredicateExecutor<CityEntity> {
}
