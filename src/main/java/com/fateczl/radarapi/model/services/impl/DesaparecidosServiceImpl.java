package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.dto.DesaparecidoDTO;
import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.repository.DesaparecidosRepository;
import com.fateczl.radarapi.model.repository.EnderecosRepository;
import com.fateczl.radarapi.model.services.DesaparecidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesaparecidosServiceImpl implements DesaparecidosService {
    @Autowired
    private DesaparecidosRepository desaparecidosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    @Override
    public Desaparecido save(DesaparecidoDTO dto) {
        Desaparecido desaparecidoConvert = dto.toModel(dto);

        enderecosRepository.saveAll(desaparecidoConvert.getEndereco());

        return  desaparecidosRepository.save(desaparecidoConvert);
    }

    @Override
    public List<Desaparecido> listAll() {
        return desaparecidosRepository.findAll();
    }

    @Override
    public Optional<Desaparecido> getDesaparecido(Long id) {
        return desaparecidosRepository.findById(id);
    }

    @Override
    public Desaparecido update(Long id, DesaparecidoDTO dto) {
        Desaparecido desaparecidoConvert = dto.toModel(dto);
        desaparecidoConvert.setIdDesaparecido(id);

        return desaparecidosRepository.save(desaparecidoConvert);
    }

    @Override
    public void delete(Long id) {
        desaparecidosRepository.deleteById(id);
    }
}
