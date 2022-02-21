package com.proyectofinalweb.proyectofinalweb.repository;


import com.proyectofinalweb.proyectofinalweb.model.Laboreo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboreoRepository extends JpaRepository<Laboreo, Integer> {


    Laboreo findById(int id);

}
