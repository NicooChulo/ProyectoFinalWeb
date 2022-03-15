package com.proyectofinalweb.proyectofinalweb.controller;


import com.proyectofinalweb.proyectofinalweb.dto.LoteDTO;
import com.proyectofinalweb.proyectofinalweb.dto.request.LoteRequestDTO;
import com.proyectofinalweb.proyectofinalweb.service.crud.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ProyectoDeCultivoController.RESOURCE)
public class ProyectoDeCultivoController {
    private static final Logger logger = LoggerFactory.getLogger(ProyectoDeCultivoController.class);
    public static final String RESOURCE = "/api/v1/proyectosCultivos";

    public static final String PROYECTOS_CULTIVOS = "/{proyecto_id}";
    public static final String SEARCH = "/search";

    private IProyectoDeCultivoService proyectoDeCultivoService;

    private IEstadoProyectosService estadoProyectosService;

    private IRegistroDeLaboreoService registroDeLaboreoService;

    private ILoteService loteService;

    private ICultivoService cultivoService;

/*
    @RequestMapping(method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public ResponseEntity<LoteDTO> create(@RequestBody LoteRequestDTO loteRequestDTO) {
        LoteDTO loteRespuesta = null;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Responded", "LoteController");

        try {

            if (campoService.buscarCampoPorNumero(loteRequestDTO.getNumeroCampo())!=null){

                logger.info("verificación: El campo existe {}", loteRequestDTO.getNumeroCampo());

                if (tipoDeSueloService.buscarTipoDeSueloPorDescripcion(loteRequestDTO.getTipoDeSuelo()) !=null){
                    logger.info("verificación: El tipo de suelo existe {}", loteRequestDTO.getTipoDeSuelo());

                    LoteDTO nuevoLote = new  LoteDTO();
                    nuevoLote.setNumeroLote(loteRequestDTO.getNumeroLote());
                    logger.info("setea el numero de lote {}", loteRequestDTO.getNumeroLote());
                    nuevoLote.setSuperficie(loteRequestDTO.getSuperficie());
                    nuevoLote.setCampo(campoService.buscarCampoPorNumero(loteRequestDTO.getNumeroCampo()));
                    nuevoLote.setTipoDeSuelo(tipoDeSueloService.buscarTipoDeSueloPorDescripcion(loteRequestDTO.getTipoDeSuelo()));

                    if (!loteService.verificarNumeroLote(nuevoLote, campoService.buscarCampoPorNumero(loteRequestDTO.getNumeroCampo()))){
                        logger.info("verificación: El numero de lote no existe {}", loteRequestDTO.getNumeroLote());
                        loteRespuesta = loteService.registrar(nuevoLote);
                        logger.info("algo {}", loteRequestDTO.getNumeroLote());
                    }
                }
            }

        } catch(Exception ex) {
            logger.info("error: El campo ya existe {}", loteRequestDTO.getNumeroCampo());
            return ResponseEntity.ok().headers(headers).body(loteRespuesta);
        }

        return ResponseEntity.ok().headers(headers).body(loteRespuesta);
    }

 */

}