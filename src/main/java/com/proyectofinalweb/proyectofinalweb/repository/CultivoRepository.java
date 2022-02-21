package com.proyectofinalweb.proyectofinalweb.repository;


import com.proyectofinalweb.proyectofinalweb.model.Cultivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultivoRepository extends JpaRepository<Cultivo, Integer> {


    Cultivo findById(int id);


}
