package com.proyectofinalweb.proyectofinalweb.service.crud;


import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;
import com.proyectofinalweb.proyectofinalweb.dto.ProyectoDeCultivoDTO;

public interface IProyectoDeCultivoService extends ICRUD<ProyectoDeCultivoDTO>{

    public boolean verificarPorNumeroDeProyecto(ProyectoDeCultivoDTO proyectoDeCultivoDTO, LoteDTO loteDTO);

}