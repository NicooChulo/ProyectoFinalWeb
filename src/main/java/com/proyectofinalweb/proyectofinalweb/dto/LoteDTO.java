package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyectofinalweb.proyectofinalweb.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Validated
@Data
public class LoteDTO {

    @JsonIgnore
    private Integer id;

    private CampoDTO campo;

<<<<<<< Updated upstream
    private String numeroCampo;
=======
    private String numeroLote;
>>>>>>> Stashed changes

    private float superficie;

    private TipoDeSueloDTO tipoDeSuelo;

    @JsonIgnore
    private List<ProyectoDeCultivoDTO> proyectoDeCultivos;


}
