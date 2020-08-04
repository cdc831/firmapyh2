package net.sytes.cantero.firma.controller;

import net.sytes.cantero.firma.entity.OpenCodeDB;
import net.sytes.cantero.firma.service.OpenCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class indexController {

    @Autowired
    OpenCodeServiceImpl openCodeServiceImpl;

     @GetMapping("/list")
    public List<OpenCodeDB> listar(){
        return openCodeServiceImpl.listarDatos();
    }

    @PostMapping("/add")
    public OpenCodeDB agregar(@RequestBody OpenCodeDB openCodeDB){
        return openCodeServiceImpl.guardarDato(openCodeDB);
    }
}
