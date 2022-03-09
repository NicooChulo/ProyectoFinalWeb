package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Validated
@Data
public class CultivoDTO {

    @JsonIgnore
    private Integer id;

    private String nombre;

    @JsonIgnore
    private List<OrdenDeLaboreoDTO> ordenDeLaboreoDTOS;


}
