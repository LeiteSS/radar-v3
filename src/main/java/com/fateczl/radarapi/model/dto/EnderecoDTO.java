package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Endereco;

import javax.persistence.Column;

public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public toModel(EnderecoDTO dto) {
        Endereco endereco = new Endereco();
        
    }
}
