package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Endereco;

public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public EnderecoDTO() {
    }

    public EnderecoDTO(String cep, String logradouro, String complemento, String bairro, String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Endereco toModel(EnderecoDTO dto) {
        Endereco enderecoDTO = new Endereco();

        enderecoDTO.setLogradouro(dto.getLogradouro());
        enderecoDTO.setBairro(dto.getBairro());
        enderecoDTO.setCidade(dto.getCidade());
        enderecoDTO.setCep(dto.getCep());
        enderecoDTO.setUf(dto.getUf());
        enderecoDTO.setComplemento(dto.getComplemento());

        return enderecoDTO;
    }


}
