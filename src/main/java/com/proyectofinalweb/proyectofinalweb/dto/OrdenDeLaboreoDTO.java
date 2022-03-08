package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyectofinalweb.proyectofinalweb.model.Laboreo;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Validated
@Data
public class OrdenDeLaboreoDTO {

    @JsonIgnore
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull(message = "El numero no puede ser Nulo")
    @Size(min = 2, message = "El numero debe tener al menos dos caracteres")
    private String numeroOrdenLaboreo;

    @ManyToOne
    private Laboreo laboreo;


}
