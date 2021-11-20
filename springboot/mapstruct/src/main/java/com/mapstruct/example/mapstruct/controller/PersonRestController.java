package com.mapstruct.example.mapstruct.controller;

import com.mapstruct.example.mapstruct.entity.PersonEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("/api/person")
public interface PersonRestController {

    @PostMapping("/add")
    ResponseEntity<PersonEntity> save(@Valid @NotNull @RequestBody PersonEntity person);

    @GetMapping("/getPerson/{id}")
    ResponseEntity<PersonEntity> getById(@Valid @NotNull @PathVariable Long id);

    @DeleteMapping("delete/{id}")
    ResponseEntity<?> delete(@Valid @NotNull @PathVariable Long id);
}
