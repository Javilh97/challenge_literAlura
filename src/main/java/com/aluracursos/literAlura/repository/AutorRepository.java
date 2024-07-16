package com.aluracursos.literAlura.repository;

import com.aluracursos.literAlura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNombreContainsIgnoreCase(String nombre);
}
