package com.proyectofinalweb.proyectofinalweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyectofinalweb.proyectofinalweb.model.*;
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

    @ManyToOne
    @JoinColumn(name = "id_campo_fk")
    private Campo campo;


    @Column(nullable = false, length = 50)
    @NotNull(message = "El numeroCampo no puede ser Nulo")
    @Size(min = 2, message = "El numeroCampo debe tener al menos dos caracteres")
    private String numeroCampo;

    private float superficie;

    @ManyToOne
    private TipoDeSuelo tipoDeSuelo;

    @OneToMany(mappedBy = "lote", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REMOVE }, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProyectoDeCultivo> proyectoDeCultivos;


}
