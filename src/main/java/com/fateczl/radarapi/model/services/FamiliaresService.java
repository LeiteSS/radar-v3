package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.dto.FamiliarDTO;
import com.fateczl.radarapi.model.entities.Familiar;

import java.util.List;
import java.util.Optional;

public interface FamiliaresService {
    Familiar save(FamiliarDTO dto);
    List<Familiar> listAll();
    Familiar update(Long id, FamiliarDTO dto);
    Optional<Familiar> getById(Long id);
    void delete(Long id);
}