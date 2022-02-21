package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.TipoDeSuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeSueloRepository extends JpaRepository<TipoDeSuelo, Integer> {


    TipoDeSuelo findById(int id);

}
