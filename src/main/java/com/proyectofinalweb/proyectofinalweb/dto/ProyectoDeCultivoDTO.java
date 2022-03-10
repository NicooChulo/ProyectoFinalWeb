package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyectofinalweb.proyectofinalweb.model.Lote;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Validated
@Data
public class ProyectoDeCultivoDTO {

    @JsonIgnore
    private Integer id;

    private Lote lote;

    private String numeroProyecto;

    private CultivoDTO cultivo;

    private EstadoDelProyectoDTO estadoDeProyecto;

    @JsonIgnore
    private List<RegistroDeLaboreoDTO> registroDeLaboreos;


}
