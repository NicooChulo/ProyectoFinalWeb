package com.proyectofinalweb.proyectofinalweb.model;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cultivos")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(description = "Información de los Empleados")
public class Cultivo {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull(message = "El nombre no puede ser Nulo")
    @Size(min = 2, message = "El nombre debe tener al menos dos caracteres")
    private String nombre;

    @OneToMany
    private List<OrdenDeLaboreo> ordenDeLaboreo;


}
