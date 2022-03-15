package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.EstadoDeProyecto;
import com.proyectofinalweb.proyectofinalweb.model.TipoDeSuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EstadoDeProyectoRepository extends JpaRepository<EstadoDeProyecto, Integer> {


    EstadoDeProyecto findById(int id);

    @Query("SELECT ep FROM estadoProyectos ts WHERE ep.descripcion = :descripcion ")
    EstadoDeProyecto findEstadoDeProyecto(@Param("descripcion") String descripcion);

}
