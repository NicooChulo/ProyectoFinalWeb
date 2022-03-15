package com.proyectofinalweb.proyectofinalweb.service.crud;

import com.proyectofinalweb.proyectofinalweb.dto.EstadoDelProyectoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.TipoDeSueloDTO;

public interface IEstadoProyectosService extends ICRUD<EstadoDelProyectoDTO>{

    EstadoDelProyectoDTO buscarEstadoDeProyectoPorDescripcion(String descripcion);

}

