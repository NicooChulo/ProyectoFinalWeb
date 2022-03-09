package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;


@Validated
@Data
public class OrdenDeLaboreoDTO {

    @JsonIgnore
    private Integer id;

    private String numeroOrdenLaboreo;

    private LaboreoDTO laboreo;


}
