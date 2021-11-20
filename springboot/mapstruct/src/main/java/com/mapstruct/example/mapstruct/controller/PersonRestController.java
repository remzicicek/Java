package com.mapstruct.example.mapstruct.controller;

import com.mapstruct.example.mapstruct.model.PersonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("/api/person")
public interface PersonRestController {

    @PostMapping("/add")
    ResponseEntity<PersonModel> save(@Valid @NotNull @RequestBody PersonModel person);

    @GetMapping("/getPerson/{id}")
    ResponseEntity<PersonModel> getById(@Valid @NotNull @PathVariable Long id);

    @DeleteMapping("delete/{id}")
    ResponseEntity<?> deleteById(@Valid @NotNull @PathVariable Long id);
}
