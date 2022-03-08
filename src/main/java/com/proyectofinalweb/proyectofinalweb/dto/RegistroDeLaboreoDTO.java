package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyectofinalweb.proyectofinalweb.model.EstadoDeCampo;
import com.proyectofinalweb.proyectofinalweb.model.Laboreo;
import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.model.ProyectoDeCultivo;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Validated
@Data
public class RegistroDeLaboreoDTO {

    @JsonIgnore
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_proyecto_de_cultivo_fk")
    private ProyectoDeCultivo proyectoDeCultivo;

    @Column(columnDefinition = "DATE")
    private LocalDate inicioRegistro;

    @Column(columnDefinition = "DATE")
    private LocalDate finalizacionRegistro;

    @OneToMany
    private List<Laboreo> laboreos;


}
