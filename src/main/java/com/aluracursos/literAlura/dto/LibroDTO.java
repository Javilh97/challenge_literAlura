package com.aluracursos.literAlura.dto;

public record LibroDTO(
        Long id,
        String titulo,
        String idioma,
        Double numeroDeDescargas,
        Autor autor
) {
}
