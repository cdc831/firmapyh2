package net.sytes.cantero.firma.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import net.sytes.cantero.firma.entity.OpenCodeDB;
import net.sytes.cantero.firma.service.OpenCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.*;

@Log
@RestController
@EnableSwagger2
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class indexController {

    @Autowired
    OpenCodeServiceImpl openCodeServiceImpl;

    @GetMapping("/list")
    public List<OpenCodeDB> listar(){
            return openCodeServiceImpl.listarDatos();
    }

    @PostMapping("/add")
    public ResponseEntity<?> agregar(@RequestBody OpenCodeDB openCodeDB){
        Map<String, String> map = new HashMap<>(3);
        Integer numero = (int) (Math.random() * 99999999) + 1;
        try {
            //Seteo los Mensajes
            map.put("reciboCod", String.valueOf(numero));
            map.put("description", "Document successfully created");
            map.put("code", "ok");
            //Genero el ID RH
            openCodeDB.setRhId(String.valueOf(numero));
            //Guardo los Valores obtenidos
            openCodeServiceImpl.guardarDato(openCodeDB);
            // Regreso la informacion
            return new ResponseEntity<>(map, HttpStatus.CREATED);
        }catch(Exception e){
            map.put("description", "Document failed to be created");
            map.put("code", "error");
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Integer id){
        Map<String, String> map = new HashMap<>(3);
        try {
            map.put("reciboCod", String.valueOf(id));
            map.put("description", "Document successfully deleted");
            map.put("code", "ok");
            openCodeServiceImpl.eliminarDato(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            map.put("reciboCod", String.valueOf(id));
            map.put("description", "Document failed to be deleted");
            map.put("code", "Error");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
