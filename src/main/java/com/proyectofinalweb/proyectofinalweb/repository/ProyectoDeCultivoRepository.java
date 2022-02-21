package com.proyectofinalweb.proyectofinalweb.repository;


import com.proyectofinalweb.proyectofinalweb.model.ProyectoDeCultivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoDeCultivoRepository extends JpaRepository<ProyectoDeCultivo, Integer> {


    ProyectoDeCultivo findById(int id);

}
