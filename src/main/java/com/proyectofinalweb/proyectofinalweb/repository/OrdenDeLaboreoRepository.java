package com.proyectofinalweb.proyectofinalweb.repository;

import com.proyectofinalweb.proyectofinalweb.model.OrdenDeLaboreo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenDeLaboreoRepository extends JpaRepository<OrdenDeLaboreo, Integer> {


    OrdenDeLaboreo findById(int id);


}
