package com.proyectofinalweb.proyectofinalweb.service.crud;


import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;

public interface ILoteService extends ICRUD<LoteDTO>{

    public boolean verificarNumeroLote(LoteDTO loteDTO, CampoDTO campoDTO);

}

