package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.dto.DoadorDTO;
import com.fateczl.radarapi.model.entities.Doador;
import com.fateczl.radarapi.model.repository.DoadoresRepository;
import com.fateczl.radarapi.model.repository.EnderecosRepository;
import com.fateczl.radarapi.model.services.DoadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoadoresServiceImpl implements DoadoresService {
    @Autowired
    private DoadoresRepository doadoresRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;


    @Override
    public Doador save(DoadorDTO dto) {
        Doador doador = dto.toModel(dto);
        enderecosRepository.save(doador.getEndereco());

        return doadoresRepository.save(doador);
    }

    @Override
    public List<Doador> listAll() {
        return doadoresRepository.findAll();
    }

    @Override
    public Optional<Doador> getById(Long id) {
        return doadoresRepository.findById(id);
    }

    @Override
    public Doador update(Long id, DoadorDTO dto) {
        Doador doador = dto.toModel(dto);
        enderecosRepository.save(doador.getEndereco());
        doador.setIdDoador(id);

        return doadoresRepository.save(doador);
    }

    @Override
    public void delete(Long id) {
        doadoresRepository.deleteById(id);
    }
}
