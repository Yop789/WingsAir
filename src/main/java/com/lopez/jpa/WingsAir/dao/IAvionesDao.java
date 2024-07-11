package com.lopez.jpa.WingsAir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopez.jpa.WingsAir.models.Aviones;

public interface IAvionesDao extends JpaRepository<Aviones, Long> {

}
