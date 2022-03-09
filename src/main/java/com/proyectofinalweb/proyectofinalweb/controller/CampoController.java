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
<<<<<<< Updated upstream

    private static final Logger logger = LoggerFactory.getLogger(CampoController.class);
    public static final String RESOURCE = "/api/v1/empleados";

    public static final String DNI = "/{empleado_dni}";
=======
    private static final Logger logger = LoggerFactory.getLogger(CampoController.class);
    public static final String RESOURCE = "/api/v1/campos";

    public static final String DNI = "/{campo_id}";
>>>>>>> Stashed changes
    public static final String SEARCH = "/search";

    private ICampoService campoService;

    public CampoController(ICampoService campoService) {
        this.campoService = campoService;
    }

<<<<<<< Updated upstream
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
=======
   /* @RequestMapping(value = DNI, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<CampoDTO> getOneCampo(@PathVariable("campo_id") String campoID) {
        logger.info("Buscar un campo por id {}", campoID);
        EmpleadoDTO empleado = this.campoService.buscarEmpleadoPorDNI(campoID);
        if (empleado == null) {
            return new ResponseEntity<EmpleadoDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<EmpleadoDTO>(empleado, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,produces = "application/json")
>>>>>>> Stashed changes
    public ResponseEntity<Collection<EmpleadoDTO>> getEmpleados(){
        logger.info("Get All Hotels");
        Collection<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
        empleados.addAll(this.campoService.listarTodos());
        if (empleados.isEmpty()){
            return new ResponseEntity<Collection<EmpleadoDTO>>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Collection<EmpleadoDTO>>(empleados, HttpStatus.OK);
        }
<<<<<<< Updated upstream
    }
*/
=======
    }*/

>>>>>>> Stashed changes

    @RequestMapping(method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public ResponseEntity<CampoDTO> create(@RequestBody CampoDTO nuevoCampo) {
        CampoDTO campoRespuesta = null;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
<<<<<<< Updated upstream
        headers.add("Responded", "EmpleadoController");

        try {
            if (campoService.bucarCampoPorNumero(nuevoCampo.getNumeroCampo())==null){
                campoRespuesta = campoService.registrar(nuevoCampo);
            }

        } catch(Exception ex) {
            System.out.println("Employee not found" + ex.getMessage());
=======
        headers.add("Responded", "CampoController");


        try {
            if (campoService.buscarCampoPorNumero(nuevoCampo.getNumeroCampo())==null){

                campoRespuesta = campoService.registrar(nuevoCampo);

            }

        } catch(Exception ex) {
            logger.info("El campo ya existe {}", nuevoCampo.getNumeroCampo());
>>>>>>> Stashed changes
            return ResponseEntity.ok().headers(headers).body(campoRespuesta);
        }

        return ResponseEntity.ok().headers(headers).body(campoRespuesta);
    }

}