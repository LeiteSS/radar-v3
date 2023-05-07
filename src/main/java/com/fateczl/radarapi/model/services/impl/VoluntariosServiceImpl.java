package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.dto.VoluntarioDTO;
import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Voluntario;
import com.fateczl.radarapi.model.repository.EnderecosRepository;
import com.fateczl.radarapi.model.repository.VoluntariosRepository;
import com.fateczl.radarapi.model.services.VoluntariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoluntariosServiceImpl implements VoluntariosService {
    @Autowired
    private VoluntariosRepository voluntariosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    @Override
    public Voluntario save(VoluntarioDTO dto) {
        Voluntario voluntario = dto.toModel(dto);
        enderecosRepository.save(voluntario.getEndereco());

        return voluntariosRepository.save(voluntario);
    }

    @Override
    public List<Voluntario> getAll() {
        return voluntariosRepository.findAll();
    }

    @Override
    public Optional<Voluntario> getVoluntario(Long id) {
        return voluntariosRepository.findById(id);
    }

    @Override
    public Voluntario update(Long id, VoluntarioDTO dto) {
        Voluntario voluntario = dto.toModel(dto);
        voluntario.setId(id);

        enderecosRepository.save(voluntario.getEndereco());


        return voluntariosRepository.save(voluntario);
    }

    @Override
    public void delete(Long id) {
        voluntariosRepository.deleteById(id);
    }
}
