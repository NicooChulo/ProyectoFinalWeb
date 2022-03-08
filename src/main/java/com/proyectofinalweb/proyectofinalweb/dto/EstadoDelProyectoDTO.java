package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
@Data
public class EstadoDelProyectoDTO {

    @JsonIgnore
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull(message = "El descripcion no puede ser Nulo")
    @Size(min = 2, message = "El descripcion debe tener al menos dos caracteres")
    private String descripcion;


}
