package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Doador;
import com.fateczl.radarapi.model.entities.Endereco;

public class DoadorDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Endereco endereco;
    private Double valor;

    public DoadorDTO() {
    }

    public DoadorDTO(String nome, String sobrenome, String cpf, Endereco endereco, Double valor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Doador toModel(DoadorDTO dto) {
        return new Doador(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getCpf(),
                dto.getEndereco(),
                dto.getValor()
        );
    }
}
