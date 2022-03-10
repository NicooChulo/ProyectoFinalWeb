package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;



import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;
import com.proyectofinalweb.proyectofinalweb.dto.TipoDeSueloDTO;
import com.proyectofinalweb.proyectofinalweb.model.Campo;
import com.proyectofinalweb.proyectofinalweb.model.Empleado;
import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.model.TipoDeSuelo;
import com.proyectofinalweb.proyectofinalweb.repository.CampoRepository;
import com.proyectofinalweb.proyectofinalweb.repository.LoteRepository;
import com.proyectofinalweb.proyectofinalweb.repository.TipoDeSueloRepository;
import com.proyectofinalweb.proyectofinalweb.service.crud.ILoteService;
import com.proyectofinalweb.proyectofinalweb.service.crud.ITipoDeSueloService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class TipoDeSueloServiceImpl implements ITipoDeSueloService {

    private CampoRepository campoRepository;

    private LoteRepository loteRepository;

    private TipoDeSueloRepository tipoDeSueloRepository;

    private ModelMapper modelMapper;

    public TipoDeSueloServiceImpl(CampoRepository campoRepository, LoteRepository loteRepository, TipoDeSueloRepository tipoDeSueloRepository, ModelMapper modelMapper) {
        this.campoRepository = campoRepository;
        this.loteRepository = loteRepository;
        this.tipoDeSueloRepository = tipoDeSueloRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public TipoDeSueloDTO registrar(TipoDeSueloDTO tipoDeSueloDTO) {
        return null;
    }

    @Override
    public TipoDeSueloDTO modificar(TipoDeSueloDTO tipoDeSueloDTO) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public TipoDeSueloDTO listarId(Integer id) {
        Optional<TipoDeSuelo> opt = tipoDeSueloRepository.findById(id);

        if (!opt.isPresent()) {
            throw new NoSuchElementException("No existe el tipo de suelo con el id: " + id);
        }
        return modelMapper.map(opt.get(), TipoDeSueloDTO.class);
    }

    @Override
    public List<TipoDeSueloDTO> listarTodos() {
        return null;
    }

    @Override
    public TipoDeSueloDTO buscarTipoDeSueloPorDescripcion(String descripcion) {
        TipoDeSuelo tipoDeSuelo = tipoDeSueloRepository.findTipoDeSueloByDescripcion(descripcion);
        if(tipoDeSuelo == null) {
            //  throw new  noSuchElementException("noexiste el tipo de suelo: " + dni);
            return  null;
        }
        return modelMapper.map(tipoDeSuelo, TipoDeSueloDTO.class);
    }
}