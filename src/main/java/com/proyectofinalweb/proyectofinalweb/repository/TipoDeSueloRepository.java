package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.model.TipoDeSuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoDeSueloRepository extends JpaRepository<TipoDeSuelo, Integer> {

    TipoDeSuelo findById(int id);

    @Query("SELECT ts FROM TipoDeSuelo ts WHERE ts.descripcion = :descripcion ")
    TipoDeSuelo findTipoDeSueloByDescripcion(@Param("descripcion") String descripcion);
}
