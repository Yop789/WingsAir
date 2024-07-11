package com.lopez.jpa.WingsAir.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface IControllers<CL, DTO> {

    ResponseEntity<?> guardar(DTO dto);

    ResponseEntity<List<CL>> findAll();

    ResponseEntity<CL> findById(Long id);

    ResponseEntity<?> deleteById(Long id);

    ResponseEntity<?> update(DTO dto);

}
