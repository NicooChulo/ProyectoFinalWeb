package com.proyectofinalweb.proyectofinalweb.controller;


import com.proyectofinalweb.proyectofinalweb.dto.CampoDTO;
import com.proyectofinalweb.proyectofinalweb.dto.EmpleadoDTO;
import com.proyectofinalweb.proyectofinalweb.service.crud.ICampoService;
import com.proyectofinalweb.proyectofinalweb.service.crud.IEmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping(CampoController.RESOURCE)
public class CampoController {

    private static final Logger logger = LoggerFactory.getLogger(CampoController.class);
    public static final String RESOURCE = "/api/v1/empleados";

    public static final String DNI = "/{empleado_dni}";
    public static final String SEARCH = "/search";

    private ICampoService campoService;

    public CampoController(ICampoService campoService) {
        this.campoService = campoService;
    }

    @RequestMapping(value = DNI, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<CampoDTO> getOneCampo(@PathVariable("numero_campo") String numeroCampo) {
        logger.info("Buscar un empleado por dni {}", numeroCampo);
        CampoDTO campo = this.campoService.bucarCampoPorNumero(numeroCampo);
        if (campo == null) {
            return new ResponseEntity<CampoDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CampoDTO>(campo, HttpStatus.OK);
    }

  /*  @RequestMapping(method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<EmpleadoDTO>> getEmpleados(){
        logger.info("Get All Hotels");
        Collection<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
        empleados.addAll(this.campoService.listarTodos());
        if (empleados.isEmpty()){
            return new ResponseEntity<Collection<EmpleadoDTO>>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Collection<EmpleadoDTO>>(empleados, HttpStatus.OK);
        }
    }
*/

    @RequestMapping(method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public ResponseEntity<CampoDTO> create(@RequestBody CampoDTO nuevoCampo) {
        CampoDTO campoRespuesta = null;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Responded", "EmpleadoController");

        try {
            if (campoService.bucarCampoPorNumero(nuevoCampo.getNumeroCampo())==null){
                campoRespuesta = campoService.registrar(nuevoCampo);
            }

        } catch(Exception ex) {
            System.out.println("Employee not found" + ex.getMessage());
            return ResponseEntity.ok().headers(headers).body(campoRespuesta);
        }

        return ResponseEntity.ok().headers(headers).body(campoRespuesta);
    }

}