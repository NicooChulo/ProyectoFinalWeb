package com.proyectofinalweb.proyectofinalweb.service.crud.implementacion;


import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import com.proyectofinalweb.proyectofinalweb.model.Campo;
import com.proyectofinalweb.proyectofinalweb.model.Empleado;
import com.proyectofinalweb.proyectofinalweb.repository.CampoRepository;
<<<<<<< Updated upstream
import com.proyectofinalweb.proyectofinalweb.service.crud.ICampoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


=======
import com.proyectofinalweb.proyectofinalweb.repository.EstadoDeCampoRepository;
import com.proyectofinalweb.proyectofinalweb.service.crud.ICampoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> Stashed changes

import java.util.List;


<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
@Service
public class CampoServiceImpl implements ICampoService {

    private CampoRepository campoRepository;

<<<<<<< Updated upstream
    private ModelMapper modelMapper;

    public CampoServiceImpl(CampoRepository campoRepository, ModelMapper modelMapper) {
        this.campoRepository = campoRepository;
=======
    private EstadoDeCampoRepository estadoDeCampoRepository;

    private ModelMapper modelMapper;

    public CampoServiceImpl(CampoRepository campoRepository, EstadoDeCampoRepository estadoDeCampoRepository, ModelMapper modelMapper) {
        this.campoRepository = campoRepository;
        this.estadoDeCampoRepository = estadoDeCampoRepository;
>>>>>>> Stashed changes
        this.modelMapper = modelMapper;
    }

    @Override
<<<<<<< Updated upstream
    public CampoDTO registrar(CampoDTO campoDTO)  {

        Campo nuevoCampo = modelMapper.map(campoDTO, Campo.class);
=======
    public CampoDTO registrar(CampoDTO campoDTO) {
        Campo nuevoCampo = modelMapper.map(campoDTO, Campo.class);
        //bucar el estado de campo, necesito el repository de estado de campo
        nuevoCampo.setEstadoDeCampo(estadoDeCampoRepository.findById(1));

>>>>>>> Stashed changes
        campoRepository.save(nuevoCampo);
        campoDTO.setId(nuevoCampo.getId());
        return campoDTO;
    }

<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public CampoDTO bucarCampoPorNumero(String numeroCampo) {

        Campo campo = campoRepository.findBynumeroCampo(numeroCampo);
=======
    public CampoDTO buscarCampoPorNumero(String numeroCampo) {
        Campo campo = campoRepository.findByNumeroCampo(numeroCampo);
>>>>>>> Stashed changes
        if(campo == null) {
            //  throw new  noSuchElementException("noexiste id: " + dni);
            return  null;
        }
        return modelMapper.map(campo, CampoDTO.class);
<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
    }
}
