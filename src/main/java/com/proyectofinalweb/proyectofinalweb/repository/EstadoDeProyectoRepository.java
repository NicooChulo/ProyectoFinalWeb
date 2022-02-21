package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.EstadoDeProyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDeProyectoRepository extends JpaRepository<EstadoDeProyecto, Integer> {


    EstadoDeProyecto findById(int id);

}
