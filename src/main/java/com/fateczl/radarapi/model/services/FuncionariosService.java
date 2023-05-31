package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.dto.DesaparecidoDTO;
import com.fateczl.radarapi.model.dto.FuncionarioDTO;
import com.fateczl.radarapi.model.dto.LoginDTO;
import com.fateczl.radarapi.model.dto.TokenDTO;
import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionariosService {

    Funcionario save(FuncionarioDTO dto);
    List<Funcionario> listAll();
    Optional<Funcionario> getFuncionario(Long id);
    Funcionario update(Long id, FuncionarioDTO dto);
    void delete(Long id);
    TokenDTO signIn(LoginDTO dto);

}
