package com.aluracursos.literAlura.dto;

public record AutorDTO(
        Long id,
        String nombre,
        Integer fechaNacimiento,
        Integer fechaFallecimiento,
        String libros
) {
}
