package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Voluntario;

import javax.persistence.Column;
import javax.persistence.OneToOne;

public class VoluntarioDTO {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private boolean condicoes;
    private boolean legitimidade;

    public VoluntarioDTO() {
    }

    public VoluntarioDTO(String nome, String sobrenome, String dataNascimento, String email, String telefone, String cpf, Endereco endereco, boolean condicoes, boolean legitimidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.condicoes = condicoes;
        this.legitimidade = legitimidade;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public boolean isCondicoes() {
        return condicoes;
    }

    public void setCondicoes(boolean condicoes) {
        this.condicoes = condicoes;
    }

    public boolean isLegitimidade() {
        return legitimidade;
    }

    public void setLegitimidade(boolean legitimidade) {
        this.legitimidade = legitimidade;
    }

    public Voluntario toModel(VoluntarioDTO dto) {
        return new Voluntario(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getDataNascimento(),
                dto.getEmail(),
                dto.getTelefone(),
                dto.getCpf(),
                dto.getEndereco(),
                dto.isCondicoes(),
                dto.isLegitimidade()
        );
    }
}
