package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FotosRepository extends JpaRepository<Foto, Long> {

    Optional<Foto> findByDesaparecido(Desaparecido desaparecido);
}
