package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.Campo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CampoRepository extends JpaRepository<Campo, Integer> {

    Campo findById(int id);
    @Query("SELECT c FROM Campo c WHERE c.numeroCampo = :numeroCampo ")
    Campo findByNumeroCampo(@Param("numeroCampo") String numeroCampo);
}

