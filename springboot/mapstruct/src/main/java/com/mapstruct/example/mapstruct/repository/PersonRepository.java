package com.mapstruct.example.mapstruct.repository;

import com.mapstruct.example.mapstruct.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long>{
}
