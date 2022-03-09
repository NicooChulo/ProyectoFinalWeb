package com.proyectofinalweb.proyectofinalweb.service.crud;

import com.proyectofinalweb.proyectofinalweb.dto.CultivoDTO;

public interface ICultivoService extends ICRUD<CultivoDTO>{

    CultivoDTO findById(int empleado_id);

}
