package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;



import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
import com.proyectofinalweb.proyectofinalweb.repository.CampoRepository;
import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;
import com.proyectofinalweb.proyectofinalweb.model.Lote;
import com.proyectofinalweb.proyectofinalweb.repository.LoteRepository;
import com.proyectofinalweb.proyectofinalweb.repository.TipoDeSueloRepository;
import com.proyectofinalweb.proyectofinalweb.service.crud.ILoteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoteServiceImpl implements ILoteService {

    private CampoRepository campoRepository;

    private LoteRepository loteRepository;

    private TipoDeSueloRepository tipoDeSueloRepository;

    private ModelMapper modelMapper;

    public LoteServiceImpl(CampoRepository campoRepository, LoteRepository loteRepository, TipoDeSueloRepository tipoDeSueloRepository, ModelMapper modelMapper) {
        this.campoRepository = campoRepository;
        this.loteRepository = loteRepository;
        this.tipoDeSueloRepository = tipoDeSueloRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public LoteDTO registrar(LoteDTO loteDTO) {
        System.out.println("llega al principio");
        Lote nuevoLote = null;
        nuevoLote = modelMapper.map(loteDTO, Lote.class);
        System.out.println("convierte a modelo");
        loteRepository.save(nuevoLote);
        System.out.println("lguarda");
        loteDTO.setId(nuevoLote.getId());
        System.out.println("setea id");
        return modelMapper.map(nuevoLote, LoteDTO.class);
    }

    @Override
    public LoteDTO modificar(LoteDTO loteDTO) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public LoteDTO listarId(Integer id) {
        return null;
    }

    @Override
    public List<LoteDTO> listarTodos() {
        return null;
    }

    @Override
    public boolean verificarNumeroLote(LoteDTO loteDTO, CampoDTO campoDTO) {
        boolean estado = false;
        for (LoteDTO lr : campoDTO.getLotes()) {
            if (lr.getNumeroLote() == loteDTO.getNumeroLote()) {
                estado = true;
            }
        }
        return estado;
    }
}

