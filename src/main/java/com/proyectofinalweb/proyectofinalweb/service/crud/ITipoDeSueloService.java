package com.proyectofinalweb.proyectofinalweb.service.crud;

import com.proyectofinalweb.proyectofinalweb.dto.TipoDeSueloDTO;

public interface ITipoDeSueloService extends ICRUD<TipoDeSueloDTO>{

    TipoDeSueloDTO buscarTipoDeSueloPorDescripcion(String descripcion);

}