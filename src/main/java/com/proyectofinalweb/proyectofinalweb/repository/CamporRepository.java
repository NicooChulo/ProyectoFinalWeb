package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.Campo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamporRepository extends JpaRepository<Campo, Integer> {

    Campo findById(int id);

}
