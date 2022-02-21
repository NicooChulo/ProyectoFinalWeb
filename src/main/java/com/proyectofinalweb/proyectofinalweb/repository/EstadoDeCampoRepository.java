package com.proyectofinalweb.proyectofinalweb.repository;


import com.proyectofinalweb.proyectofinalweb.model.EstadoDeCampo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDeCampoRepository extends JpaRepository<EstadoDeCampo, Integer> {


    EstadoDeCampo findById(int id);

}
