package com.aluracursos.literAlura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("libros")
public class LibrosController {
    @Autowired
    private ServiceService service;

    @GetMapping()
    public List<LibroDTO> obtenerTodosLosLibros(){
        return service.obtenerTodosLosLibros();
    }
}
