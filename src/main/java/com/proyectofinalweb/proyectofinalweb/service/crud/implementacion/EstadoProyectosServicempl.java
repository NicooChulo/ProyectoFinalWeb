package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;



import com.proyectofinalweb.proyectofinalweb.dto.EstadoDelProyectoDTO;
import com.proyectofinalweb.proyectofinalweb.model.EstadoDeProyecto;
import com.proyectofinalweb.proyectofinalweb.repository.*;
import com.proyectofinalweb.proyectofinalweb.service.crud.IEstadoProyectosService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class EstadoProyectosServicempl implements IEstadoProyectosService {


    private EstadoDeProyectoRepository estadoDeProyectoRepository;

    private ProyectoDeCultivoRepository proyectoDeCultivoRepository;

    private ModelMapper modelMapper;

    public EstadoProyectosServicempl(EstadoDeProyectoRepository estadoDeProyectoRepository, ProyectoDeCultivoRepository proyectoDeCultivoRepository, ModelMapper modelMapper) {
        this.estadoDeProyectoRepository = estadoDeProyectoRepository;
        this.proyectoDeCultivoRepository = proyectoDeCultivoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public EstadoDelProyectoDTO registrar(EstadoDelProyectoDTO estadoDelProyectoDTO) {

        return null;
    }

    @Override
    public EstadoDelProyectoDTO modificar(EstadoDelProyectoDTO estadoDelProyectoDTO) {

        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public EstadoDelProyectoDTO listarId(Integer id) {
        Optional<EstadoDeProyecto> opt = estadoDeProyectoRepository.findById(id);

        if (!opt.isPresent()) {
            throw new NoSuchElementException("No existe el tipo de suelo con el id: " + id);
        }
        return modelMapper.map(opt.get(), EstadoDelProyectoDTO.class);
    }

    @Override
    public List<EstadoDelProyectoDTO> listarTodos() {

        return null;
    }

    @Override
    public EstadoDelProyectoDTO buscarEstadoDeProyectoPorDescripcion(String descripcion) {
        EstadoDeProyecto estadoDeProyecto = estadoDeProyectoRepository.findEstadoDeProyecto(descripcion);
        if (estadoDeProyecto == null){
            throw new NoSuchElementException("No existe el estado de proyecto " + descripcion);
        }
        return modelMapper.map(estadoDeProyecto, EstadoDelProyectoDTO.class);
    }

}