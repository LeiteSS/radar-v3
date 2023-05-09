package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.dto.VoluntarioDTO;
import com.fateczl.radarapi.model.entities.Voluntario;
import com.fateczl.radarapi.model.repository.VoluntarioRepository;
import com.fateczl.radarapi.model.repository.EnderecosRepository;
import com.fateczl.radarapi.model.services.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoluntarioServiceImpl implements VoluntarioService {
    @Autowired
    private VoluntarioRepository voluntariosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    @Override
    public Voluntario save(VoluntarioDTO dto) {
        Voluntario voluntarioConvert = dto.toModel(dto);

        enderecosRepository.save(voluntarioConvert.getEndereco());

        return  voluntariosRepository.save(voluntarioConvert);
    }

    @Override
    public List<Voluntario> listAll() {
        return voluntariosRepository.findAll();
    }

    @Override
    public Optional<Voluntario> getVoluntario(Long id) {
        return voluntariosRepository.findById(id);
    }

    @Override
    public Voluntario update(Long id, VoluntarioDTO dto) {
        Voluntario voluntarioConvert = dto.toModel(dto);
        voluntarioConvert.setIdVoluntario(id);

        return voluntariosRepository.save(voluntarioConvert);
    }

    @Override
    public void delete(Long id) {
        voluntariosRepository.deleteById(id);
    }
}
