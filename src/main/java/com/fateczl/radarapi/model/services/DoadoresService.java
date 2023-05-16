package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.dto.DoadorDTO;
import com.fateczl.radarapi.model.entities.Doador;

import java.util.List;
import java.util.Optional;

public interface DoadoresService {
    Doador save(DoadorDTO dto);
    List<Doador> listAll();
    Optional<Doador> getById(Long id);
    Doador update(Long id, DoadorDTO dto);
    void delete(Long id);
}
