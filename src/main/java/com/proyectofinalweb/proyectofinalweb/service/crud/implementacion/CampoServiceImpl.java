package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;


import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;

import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import com.proyectofinalweb.proyectofinalweb.model.Campo;
import com.proyectofinalweb.proyectofinalweb.model.Empleado;
import com.proyectofinalweb.proyectofinalweb.repository.CampoRepository;
import com.proyectofinalweb.proyectofinalweb.service.crud.ICampoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;



import java.util.List;


@Service
public class CampoServiceImpl implements ICampoService {

    private CampoRepository campoRepository;

    private ModelMapper modelMapper;

    public CampoServiceImpl(CampoRepository campoRepository, ModelMapper modelMapper) {
        this.campoRepository = campoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CampoDTO registrar(CampoDTO campoDTO)  {

        Campo nuevoCampo = modelMapper.map(campoDTO, Campo.class);
        campoRepository.save(nuevoCampo);
        campoDTO.setId(nuevoCampo.getId());
        return campoDTO;
    }



    @Override
    public CampoDTO modificar(CampoDTO campoDTO) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public CampoDTO listarId(Integer id) {
        return null;
    }

    @Override
    public List<CampoDTO> listarTodos() {
        return null;
    }

    @Override
    public CampoDTO bucarCampoPorNumero(String numeroCampo) {

        Campo campo = campoRepository.findBynumeroCampo(numeroCampo);
        if(campo == null) {
            //  throw new  noSuchElementException("noexiste id: " + dni);
            return  null;
        }
        return modelMapper.map(campo, CampoDTO.class);


    }
}
