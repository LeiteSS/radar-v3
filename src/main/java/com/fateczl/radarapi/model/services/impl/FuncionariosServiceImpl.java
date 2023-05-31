package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.dto.FuncionarioDTO;
import com.fateczl.radarapi.model.dto.LoginDTO;
import com.fateczl.radarapi.model.dto.TokenDTO;
import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Funcionario;
import com.fateczl.radarapi.model.repository.EnderecosRepository;
import com.fateczl.radarapi.model.repository.FuncionariosRepository;
import com.fateczl.radarapi.model.services.FuncionariosService;
import com.fateczl.radarapi.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosServiceImpl implements FuncionariosService {
    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @Override
    public Funcionario save(FuncionarioDTO dto) {
        Funcionario funcionario = dto.toModel(dto);

        //enderecosRepository.save(funcionario.getEndereco());

        return funcionariosRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> listAll() {
        return funcionariosRepository.findAll();
    }

    @Override
    public Optional<Funcionario> getFuncionario(Long id) {
        return funcionariosRepository.findById(id);
    }

    @Override
    public Funcionario update(Long id, FuncionarioDTO dto) {
        Funcionario funcionario = dto.toModel(dto);

        funcionario.setId(id);

        /*Endereco endereco = enderecosRepository.getReferenceById(funcionario.getEndereco().getIdEndereco());
        endereco.setIdEnderec(funcionario.getEndereco().getIdEndereco());
        enderecosRepository.save(endereco);*/

        return funcionariosRepository.save(funcionario);
    }

    @Override
    public void delete(Long id) {
        funcionariosRepository.deleteById(id);
    }

    @Override
    public TokenDTO signIn(LoginDTO dto) {
        UsernamePasswordAuthenticationToken loginData = dto.convert();
        Authentication auth = authenticationManager.authenticate(loginData);
        String token = tokenService.getToken(auth);

        return new TokenDTO(token, "Bearer");
    }
}
