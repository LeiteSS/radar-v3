package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Desaparecido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesaparecidosRepository extends JpaRepository<Desaparecido, Long> {
}
