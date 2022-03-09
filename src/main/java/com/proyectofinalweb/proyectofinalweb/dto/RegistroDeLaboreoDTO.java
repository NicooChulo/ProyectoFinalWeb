package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.time.LocalDate;
import java.util.List;

@Validated
@Data
public class RegistroDeLaboreoDTO {

    @JsonIgnore
    private Integer id;

    private ProyectoDeCultivoDTO proyectoDeCultivo;

    private LocalDate inicioRegistro;

    private LocalDate finalizacionRegistro;

    @JsonIgnore
    private List<LaboreoDTO> laboreos;


}
