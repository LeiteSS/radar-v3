package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FotosRepository extends JpaRepository<Foto, Long> {
}
