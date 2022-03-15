package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;

import com.proyectofinalweb.proyectofinalweb.dto.RegistroDeLaboreoDTO;
import com.proyectofinalweb.proyectofinalweb.model.Laboreo;
import com.proyectofinalweb.proyectofinalweb.model.RegistroDeLaboreo;
import com.proyectofinalweb.proyectofinalweb.repository.RegistroDeLaboreoRepository;
import com.proyectofinalweb.proyectofinalweb.service.crud.IRegistroDeLaboreoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RegistroDeLaboreoServiceImpl implements IRegistroDeLaboreoService {

    private RegistroDeLaboreoRepository registroDeLaboreoRepository;

    private List<Laboreo> laboreos;

    private ModelMapper modelMapper;

    public RegistroDeLaboreoServiceImpl(RegistroDeLaboreoRepository registroDeLaboreoRepository, List<Laboreo> laboreos, ModelMapper modelMapper) {
        this.registroDeLaboreoRepository = registroDeLaboreoRepository;
        this.laboreos = laboreos;
        this.modelMapper = modelMapper;
    }

    @Override
    public RegistroDeLaboreoDTO registrar(RegistroDeLaboreoDTO registroDeLaboreoDTO) {

        RegistroDeLaboreo nuevoRegistro = modelMapper.map(registroDeLaboreoDTO, RegistroDeLaboreo.class);

        registroDeLaboreoRepository.save(nuevoRegistro);

        registroDeLaboreoDTO.setId(nuevoRegistro.getId());

        return modelMapper.map(nuevoRegistro, RegistroDeLaboreoDTO.class);
    }

    @Override
    public RegistroDeLaboreoDTO modificar(RegistroDeLaboreoDTO registroDeLaboreoDTO) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public RegistroDeLaboreoDTO listarId(Integer id) {
        return null;
    }


    @Override
    public List<RegistroDeLaboreoDTO> listarTodos() {
        return null;
    }


    @Override
    public RegistroDeLaboreoDTO findById(int registro_id) {
        RegistroDeLaboreo registro = registroDeLaboreoRepository.findById(registro_id);

        if (registro == null){
            throw new NoSuchElementException("No existe registro con el id: " + registro_id);
        }
        return modelMapper.map(registro, com.proyectofinalweb.proyectofinalweb.dto.RegistroDeLaboreoDTO.class);
    }
}
