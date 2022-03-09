package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Validated
@Data
public class CampoDTO {

    @JsonIgnore
    private Integer id;

    private String numeroCampo;

    private EstadoDeCampoDTO estadoCampo;

    @JsonIgnore
    private List<LoteDTO> lotes;


}
