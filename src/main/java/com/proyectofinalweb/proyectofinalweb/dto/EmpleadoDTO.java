package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
public class EmpleadoDTO {

    @JsonIgnore
    private Integer id;

    private String nombre;

    private String apellido;

    private String dni;

}
