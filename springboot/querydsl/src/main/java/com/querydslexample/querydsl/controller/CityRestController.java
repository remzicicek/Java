package com.querydslexample.querydsl.controller;

import com.querydslexample.querydsl.entity.CityEntity;
import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("/api/city")
public interface CityRestController {

    @PostMapping("/add")
    ResponseEntity<CityEntity> save(@Valid @NotNull @RequestBody CityEntity city);

    @GetMapping("/getCity/{name}")
    ResponseEntity<CityEntity> getByName(@Valid @NotNull @PathVariable String name);

    @DeleteMapping("delete/{id}")
    ResponseEntity<?> delete(@Valid @NotNull @PathVariable Long id);
}
