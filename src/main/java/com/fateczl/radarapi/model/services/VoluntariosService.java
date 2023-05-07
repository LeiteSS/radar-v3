package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.dto.VoluntarioDTO;
import com.fateczl.radarapi.model.entities.Voluntario;

import java.util.List;
import java.util.Optional;

public interface VoluntariosService {

    Voluntario save(VoluntarioDTO dto);
    List<Voluntario> getAll();
    Optional<Voluntario> getVoluntario(Long id);
    Voluntario update(Long id, VoluntarioDTO dto);
    void delete(Long id);
}
