package com.proyectofinalweb.proyectofinalweb.repository;


import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.model.ProyectoDeCultivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProyectoDeCultivoRepository extends JpaRepository<ProyectoDeCultivo, Integer> {


    ProyectoDeCultivo findById(int id);

    @Query("SELECT l FROM Lote l WHERE l.campo = :campo ")
    List<Lote> findLoteByCampo(@Param("campo") String campo);
}
