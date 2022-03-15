package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;



import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;
import com.proyectofinalweb.proyectofinalweb.dto.ProyectoDeCultivoDTO;
import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.model.ProyectoDeCultivo;
import com.proyectofinalweb.proyectofinalweb.repository.*;
import com.proyectofinalweb.proyectofinalweb.service.crud.IEstadoProyectosService;
import com.proyectofinalweb.proyectofinalweb.service.crud.ILoteService;
import com.proyectofinalweb.proyectofinalweb.service.crud.IProyectoDeCultivoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProyectoDeCultivoServiceImpl implements IProyectoDeCultivoService {


    private LoteRepository loteRepository;

    private ProyectoDeCultivoRepository proyectoDeCultivoRepository;

    private EstadoDeProyectoRepository estadoDeProyectoRepository;

    private ModelMapper modelMapper;

    public ProyectoDeCultivoServiceImpl(LoteRepository loteRepository, ProyectoDeCultivoRepository proyectoDeCultivoRepository, EstadoDeProyectoRepository estadoDeProyectoRepository, ModelMapper modelMapper) {
        this.loteRepository = loteRepository;
        this.proyectoDeCultivoRepository = proyectoDeCultivoRepository;
        this.estadoDeProyectoRepository = estadoDeProyectoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProyectoDeCultivoDTO registrar(ProyectoDeCultivoDTO proyectoDeCultivoDTO) {
        return null;
    }

    @Override
    public ProyectoDeCultivoDTO modificar(ProyectoDeCultivoDTO proyectoDeCultivoDTO) {
        ProyectoDeCultivo nuevoProyectoDeCultivo = modelMapper.map(proyectoDeCultivoDTO, ProyectoDeCultivo.class);
        nuevoProyectoDeCultivo.setEstadoDeProyecto(estadoDeProyectoRepository.findEstadoDeProyecto("Preparacion"));
        proyectoDeCultivoRepository.save(nuevoProyectoDeCultivo);
        nuevoProyectoDeCultivo.setId(proyectoDeCultivoDTO.getId());

        //return modelMapper.map(nuevoProyectoDeCultivo, proyectoDeCultivoDTO.getClass());

        return proyectoDeCultivoDTO;
    }


    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public ProyectoDeCultivoDTO listarId(Integer id) {
        return null;
    }

    @Override
    public List<ProyectoDeCultivoDTO> listarTodos() {
        return null;
    }

    @Override
    public boolean verificarPorNumeroDeProyecto(ProyectoDeCultivoDTO proyectoDeCultivoDTO, LoteDTO loteDTO) {
        boolean estado = false;
        for (ProyectoDeCultivoDTO pr: loteDTO.getProyectoDeCultivos()){
            if (pr.getNumeroProyecto() == proyectoDeCultivoDTO.getNumeroProyecto()){
                estado = true;
            }
        }
        return estado;
    }



}