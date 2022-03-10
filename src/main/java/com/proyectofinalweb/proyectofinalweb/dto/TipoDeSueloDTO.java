package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Validated
@Data
public class TipoDeSueloDTO {

    @JsonIgnore
    private Integer id;

    private String descripcion;

    @JsonIgnore
    private List<CultivoDTO> cultivos;

}
