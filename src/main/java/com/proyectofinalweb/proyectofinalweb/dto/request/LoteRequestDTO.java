package com.proyectofinalweb.proyectofinalweb.dto.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
public class LoteRequestDTO {

    private String numeroCampo;

    private String numeroLote;

    private Float superficie;


    //Tipo de suelo es la variable descripción
    private String tipoDeSuelo;
}

