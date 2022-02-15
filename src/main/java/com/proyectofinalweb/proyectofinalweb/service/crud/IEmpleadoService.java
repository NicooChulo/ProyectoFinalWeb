package com.proyectofinalweb.proyectofinalweb.service.crud;

import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import com.proyectofinalweb.proyectofinalweb.model.Empleado;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IEmpleadoService extends ICRUD<EmpleadoDTO> {

    EmpleadoDTO buscarEmpleadoPorDNI(String dni);

    EmpleadoDTO findById(int empleado_id);

    EmpleadoDTO modificarEmpleado(EmpleadoDTO empleadoDTO);

}
