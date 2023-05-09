package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntariosRepository extends JpaRepository<Voluntario, Long> {
}
