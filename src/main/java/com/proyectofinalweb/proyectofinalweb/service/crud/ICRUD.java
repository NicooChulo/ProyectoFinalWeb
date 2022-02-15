package com.proyectofinalweb.proyectofinalweb.service.crud;

import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICRUD<DTO>{

    DTO registrar(DTO dto);

    DTO modificar(DTO dto);

    void eliminar(Integer id);

    DTO listarId(Integer id);

    List<DTO> listarTodos();

}
