package com.aluracursos.literAlura.service;

import com.aluracursos.literAlura.dto.LibroDTO;
import com.aluracursos.literAlura.repository.AutorRepository;
import com.aluracursos.literAlura.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceService {
    @Autowired
    private LibrosRepository librosRepository;
    @Autowired
    private AutorRepository autorRepository;

    public List<LibroDTO> obtenerTodosLosLibros() {
        return convierteDatos(librosRepository.todosLosLibros());
    }

    public List<LibroDTO> convierteDatos(List<Libro> libro) {
        return libro.stream()
                .map(s -> new LibroDTO(s.getId(), s.getTitulo(), s.getIdiomas(), s.getNumeroDeDescargas(), s.getAutor()))
                .collect(Collectors.toList());
    }
}
