package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Validated
@Data
public class LoteDTO {

    @JsonIgnore
    private Integer id;

    private CampoDTO campo;

    private String numeroLote;

    private float superficie;

    private TipoDeSueloDTO tipoDeSuelo;

    @JsonIgnore
    private List<ProyectoDeCultivoDTO> proyectoDeCultivos;


}
