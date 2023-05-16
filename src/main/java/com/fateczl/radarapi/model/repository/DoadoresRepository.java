package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoadoresRepository extends JpaRepository<Doador, Long> {
}
