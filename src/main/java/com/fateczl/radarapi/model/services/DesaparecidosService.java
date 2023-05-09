package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.dto.DesaparecidoDTO;
import com.fateczl.radarapi.model.entities.Desaparecido;

import java.util.List;
import java.util.Optional;

public interface DesaparecidosService {
    Desaparecido save(Desaparecido dto);
    List<Desaparecido> listAll();
    Optional<Desaparecido> getDesaparecido(Long id);
    Desaparecido update(Long id, Desaparecido dto);
    void delete(Long id);
}
