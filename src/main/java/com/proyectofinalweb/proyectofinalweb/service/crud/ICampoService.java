package com.proyectofinalweb.proyectofinalweb.service.crud;


import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;

public interface ICampoService extends ICRUD<CampoDTO>{

    CampoDTO bucarCampoPorNumero(String numeroCampo);

}
